package org.zenu.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;

/** Classe com métodos para manipulação da tabela (Data Access Object) */
public class UsuarioDAO {
    //Atributos
    private Connection conexao;

    //Construtor vazio

    //--- Métodos de manipulação do banco -------------------------------
    /** Cadastra um novo usuário na tabela
     * através de um {@code PreparedStatement}
     * @param usuario Traga um Objeto usuário com os atributos para cadastro.
     */
    public void cadastrar(Usuario novUsuario){
        // prepared statement com try catch
        PreparedStatement p_stmt = null;

        try {
            //Obtenha uma conexão ao banco
            conexao = MSSQLConnect.conectar();
            
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
            System.err.println("[ERRO] SQL Reclamou...");
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
    public List<Usuario> listar(){
        //pegar um result set com todos os registros da tabela e armazená-los em uma lista

        List<Usuario> lista = new ArrayList<Usuario>();
        PreparedStatement p_stmt = null;
        ResultSet sqlout = null;

        try {
            //Conecte ao DB, prepare e execute a query.
            conexao = MSSQLConnect.conectar();
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
            System.err.println("[ERRO] Na conexão ou declaração SQL:");
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
    public void remover(int codigo){
        //Conectar, preparar a declaração e executar com o índice.
        Connection conexao = null; 
        PreparedStatement p_stmt = null;
        String dml = "DELETE FROM usuario WHERE ID=?";

        try {
            conexao = MSSQLConnect.conectar();
            p_stmt = conexao.prepareStatement(dml);

            p_stmt.setInt(1, codigo);
            p_stmt.executeUpdate();
            System.out.println("Registro removido");

        } catch (SQLException sqle) {
            System.err.println("[ERRO] Na conexão ou declaração SQL:");
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
     * @return 
     */
    //public ResultSet queryID(int id){}

    /** Atualiza um registro da tabela (depende de query) */
    public void atualizar(){}

    //--- Métodos getters e setters -------------------------------------

}
