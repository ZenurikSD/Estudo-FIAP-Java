package org.zenu.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/** Conexão ao servidor do db MSSQL */
public class MSSQLConnect {
    
    /** Método estático para conexão entre o JDBC e o SQLServer.
     * Feche a conexão depois de usar!
     * @return Objeto de conexão 
     */
    public static Connection conectar(){
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
