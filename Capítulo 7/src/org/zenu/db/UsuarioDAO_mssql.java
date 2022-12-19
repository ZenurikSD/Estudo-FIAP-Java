package org.zenu.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;
import org.zenu.db.dao_interfaces.UsuarioDAO;
import org.zenu.db.singleton.MSSQLConnect;

/** Implementação do UsuarioDAO no SQL Server */
public class UsuarioDAO_mssql implements UsuarioDAO{
    //Atributos
    private Connection conexao;
    private PreparedStatement p_stmt;

    //Construtor vazio

    //--- Métodos de manipulação do banco ----------------------------
    /** Cadastra um novo usuário na tabela
     * através de um {@code PreparedStatement}
     * @param usuario Traga um Objeto usuário com os atributos para cadastro.
     */
    @Override
    public void cadastrar(Usuario novUsuario){
        // prepared statement com try catch

        try {
            //Obtenha uma conexão ao banco
            conexao = MSSQLConnect.getInstancia().getConexao();
            
            //Prepare a declaração
            String dml = "INSERT INTO usuario (Nome, Data, Valor) VALUES (?, ?, ?)";
            p_stmt = conexao.prepareStatement(dml);
            System.out.println("[STATUS] Preparando SQL..");

            //Insira os valores
            //Conversão de Calendar pra SQL Date (tempo em milissegundos)
            java.sql.Date data = new java.sql.Date(novUsuario.getData().getTimeInMillis());

            p_stmt.setString(1, novUsuario.getNome());
            p_stmt.setDate(2, data);
            p_stmt.setInt(3, novUsuario.getValor());

            //Execute a declaração
            p_stmt.executeUpdate();

        } catch (SQLException sqle) {
            System.err.println("[ERRO] Ao conectar ou cadastrar novo usuário com SQL...");
            System.err.println(sqle.getMessage());

        } catch (Exception e){
            System.err.println("[ERRO] Olha ai em baixo, eu não sei de nada");
            e.printStackTrace();
        } finally{
            //Feche 
            try {
                conexao.close();
                p_stmt.close();     
            } catch (SQLException sqle) {
                System.err.println("[ERRO] Ao finalizar a conexão ou declaração");
                System.err.println(sqle.getMessage()+"\n"+sqle.getSQLState());
            }
           
        }

    }

    /** Lista de todos os registros da tabela
     * <p><i>Se o DB fosse maior, eu criava algo pra limitar o tamanho e não levar uma eternidade pra listar.</i></p>
     * @return {@code List} de objetos {@link Usuario}
     */
    @Override
    public List<Usuario> listar(){
        //pegar um result set com todos os registros da tabela e armazená-los em uma lista

        List<Usuario> lista = new ArrayList<Usuario>();
        ResultSet sqlout = null;

        try {
            //Conecte ao DB, prepare e execute a query.
            conexao = MSSQLConnect.getInstancia().getConexao();
            p_stmt = conexao.prepareStatement("SELECT * FROM usuario");
            sqlout = p_stmt.executeQuery();

            //Salve cada registro encontrado
            while(sqlout.next()){
                int id = sqlout.getInt(1);
                String nome = sqlout.getString(2);
                //Conversão data sql > data calendar
                java.sql.Date data_sql = sqlout.getDate(3); 
                Calendar data = Calendar.getInstance();
                data.setTimeInMillis(data_sql.getTime());

                int valor = sqlout.getInt(4);

                //Armazena em um novo objeto e o passa pra lista
                Usuario user = new Usuario(id, nome, data, valor);
                lista.add(user);
            }

        } catch (SQLException sqle) {
            System.err.println("[ERRO] Na conexão ou ao tentar listar registros SQL:");
            System.err.println(sqle.getMessage());

        } catch(Exception e){
            System.err.println("[ERRO] God help you");
            System.err.println(e.getMessage());
            e.printStackTrace();

        } finally{
            try {
                conexao.close();
                p_stmt.close();
                sqlout.close();

            } catch (SQLException sqle) {
                System.err.println("[ERRO] Ao finalizar conexão ou declaração. Um recurso pode estar ocupado?");
                System.err.println(sqle.getMessage());
            }
        }

        return lista;
    }

    /** Remove um registro da tabela
     * @param codigo O código (ID) do usuário a remover
     */
    @Override
    public void remover(int codigo){
        //Conectar, preparar a declaração e executar com o índice.

        try {
            conexao = MSSQLConnect.getInstancia().getConexao();
            p_stmt = conexao.prepareStatement("DELETE FROM usuario WHERE ID=?");

            p_stmt.setInt(1, codigo);
            p_stmt.executeUpdate();
            System.out.println("Registro removido");

        } catch (SQLException sqle) {
            System.err.println("[ERRO] Na conexão ou remoção do registro no SQL:");
            System.err.println(sqle.getMessage());

        } catch(Exception e){
            System.err.println("[ERRO] God help you");
            System.err.println(e.getMessage());
            e.printStackTrace();

        } finally{
            try {
                conexao.close();
                p_stmt.close();

            } catch (SQLException sqle) {
                System.err.println("[ERRO] Ao finalizar conexão ou declaração. Um recurso pode estar ocupado?");
                System.err.println(sqle.getMessage());
            }
        }
    }

    /** Busca um registro na tabela pela ID
     * @return Usuário (registro) do código indicado
     */
    @Override
    public Usuario buscarPorID(int id){
        //Abrir a conexão, fazer um p_stmt de SELECT WHERE ID, salvar o ResultSet em um novo usuário e retorná-lo.

        Usuario user = null;
        ResultSet sqlout = null;
        String query = "SELECT ID, Nome, Data, Valor FROM usuario WHERE ID=?";

        try {
            conexao = MSSQLConnect.getInstancia().getConexao();
            p_stmt = conexao.prepareStatement(query);

            p_stmt.setInt(1, id);

            sqlout = p_stmt.executeQuery();
        
            //Preencha a instância do usuário se um ResultSet existir.
            while(sqlout.next()){
                int codigo = sqlout.getInt(1);
                String nome = sqlout.getString(2);
                //Conversão data sql > data calendar
                java.sql.Date data_sql = sqlout.getDate(3); 
                Calendar data = Calendar.getInstance();
                data.setTimeInMillis(data_sql.getTime());

                int valor = sqlout.getInt(4);

                user = new Usuario(codigo, nome, data, valor);
            }

        } catch (SQLException sqle) {
            System.err.println("[ERRO] Na conexão ou busca pela ID no SQL:");
            System.err.println(sqle.getMessage());

        } catch(Exception e){
            System.err.println("[ERRO] God help you");
            System.err.println(e.getMessage());
            e.printStackTrace();

        } finally{
            try {
                conexao.close();
                p_stmt.close();

            } catch (SQLException sqle) {
                System.err.println("[ERRO] Ao finalizar conexão ou declaração. Um recurso pode estar ocupado?");
                System.err.println(sqle.getMessage());
            }
        }


        return user;
    }

    /** Atualiza um registro da tabela (depende de query) 
     * É preciso dar commit manual após executar a query para que funcione.
     * @param user O usuário (registro retornado do {@link buscarPorID}
     * que você deseja atualizar.
    */
    @Override
    public void atualizar(Usuario user){
        //Abrir a conexão, preparar a declaração com os valores do usuário, executar.
        
        try {
            conexao = MSSQLConnect.getInstancia().getConexao();
            p_stmt = conexao.prepareStatement("UPDATE usuario SET Nome=?, Data=?, Valor=? WHERE ID=?");

            conexao.setAutoCommit(false);

            //Definição dos parâmetros
            p_stmt.setString(1, user.getNome());
            //Conversão chata...
            java.sql.Date dt = new java.sql.Date(user.getData().getTimeInMillis());
            p_stmt.setDate(2, dt);
            p_stmt.setInt(3, user.getValor());
            p_stmt.setInt(4, user.getId());

            //Executa a declaração
            p_stmt.executeUpdate();

            conexao.commit();

        } catch (SQLException sqle) {
            try {
                conexao.rollback(); //commit e rollback
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.err.println("[ERRO] Na conexão ou no comando SQL UPDATE:");
            System.err.println(sqle.getMessage());

        } catch(Exception e){
            System.err.println("[ERRO] God help you");
            System.err.println(e.getMessage());
            e.printStackTrace();

        } finally{
            try {
                conexao.close();
                p_stmt.close();

            } catch (SQLException sqle) {
                System.err.println("[ERRO] Ao finalizar conexão ou declaração. Um recurso pode estar ocupado?");
                System.err.println(sqle.getMessage());
            }
        }
    }
}
