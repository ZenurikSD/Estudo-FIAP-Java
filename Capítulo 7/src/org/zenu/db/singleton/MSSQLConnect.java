package org.zenu.db.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/** Implementa e instancia uma conexão <b>única e global</b> ao servidor do db MSSQL. 
 * Formato de singleton.
*/
public class MSSQLConnect {

    //Atributo estático para guardar a única instância
    private static MSSQLConnect instance;

    //Construtor privado
    private MSSQLConnect(){}

    /** Método criador da instância de conexão 
     * @return Instância única e global dessa classe
    */
    public static MSSQLConnect getInstancia(){
        if(instance==null){
            instance = new MSSQLConnect();
        }
        return instance;
    }
    
    /** Implementação da conexão entre o JDBC e o SQLServer.
     * Feche a conexão depois de usar!
     * @return Objeto de conexão 
     */
    public Connection getConexao(){
        Connection conexao = null;

        try {
            String url =
                "jdbc:sqlserver://localhost:1433;"
                +"database=testeJDBC;"
                +"user=SA;"
                +"password=@Ali-fmu2022;"
                +"encrypt=false";

            conexao = DriverManager.getConnection(url);
            
            System.out.println("[STATUS] Conectado ao banco 'testeJDBC' no SQL Server");

        } catch (SQLException sqle) {
            System.err.println("[ERRO] Não foi possível conectar. O servidor está online?");
            System.err.println(sqle.getMessage());

        } catch (Exception e){
            System.err.println("[ERRO] Sei não, se vira aí");
            e.printStackTrace();
        }

        return conexao;
    }
}
