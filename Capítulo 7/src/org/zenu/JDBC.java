package org.zenu;

import java.sql.*;

/* Conexão com banco de dados SQL Server */
public class JDBC {
    public static void main(String[] args) {

        //URL do servidor e opções de conexão
        String connectURL = 
            "jdbc:sqlserver://localhost:1433;"
            + "database=Regioes_Brasil;"
            + "user=SA;"
            + "password=@Ali-fmu2022;"
            + "encrypt=false"; //Necessário para conectar sem SSL

        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connectMSSQL = DriverManager.getConnection(connectURL);

            System.out.println("Servidor conectado");

            //Tem que ser tudo dentro do Try?
            //Declarações estáticas
            Statement stmt = connectMSSQL.createStatement();
            String insertSQL = 
                "INSERT INTO Estado VALUES ('Minas Gerais', 'MG', 2)";
            String updateSQL = 
                "UPDATE Estado SET NM_Estado='Acre', Sigla_Estado='AC' WHERE NM_Estado = 'Amazonas' ";
            String selectSQL = 
                "SELECT * FROM Estado";

            // stmt.executeUpdate(insertSQL);
            // System.out.println("Minas gerais inserido");

            // stmt.executeUpdate(updateSQL);
            // System.out.println("Amazonas trocado por Acre");

            ResultSet conjunto = stmt.executeQuery(selectSQL);

            while(conjunto.next() != false){
                //Exibe as 3 primeiras colunas da linha atual do ResultSet
                System.out.println(
                    conjunto.getString(1)+"  "
                    +conjunto.getString(2)+"   "
                    +conjunto.getString(3));
            }
            
            connectMSSQL.close();

        } catch (SQLException sqle){
            System.err.println(
                "\n[Erro SQL] Falha na conexão ou execução de alguma instrução\n");
            sqle.printStackTrace();

        } catch(ClassNotFoundException cnfe){
            System.err.println("\nDriver JDBC não encontrado\n");
            cnfe.printStackTrace();

        }
    
        
    
    }
}
