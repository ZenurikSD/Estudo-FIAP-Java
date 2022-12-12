package org.zenu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/** Declarações SQL Preparadas */
public class PrepSQLStmt {
    public static void main(String[] args) {

    String url =
        "jdbc:sqlserver://localhost:1433;"
        +"database=testeJDBC;"
        +"user=SA;"
        +"password=@Ali-fmu2022;"
        +"encrypt=false";

    String prep_select = "SELECT * FROM usuario WHERE Nome = ?";

    try {
        // conectar ao servidor (ñ é mais necessário registrar a classe do driver, ele detecta)
        Connection mssql = DriverManager.getConnection(url);
        System.out.println("[STATUS] Servidor Conectado");

        //Preparar a declaração e definir o valor
        PreparedStatement prep_stmt = mssql.prepareStatement(prep_select);
        prep_stmt.setString(1, "Alisson");     //Pesquisa por esse nome

        //acessar o result set
        ResultSet output = prep_stmt.executeQuery();
        System.out.println("[STATUS] Executando query...");

        //Tentei fazer algo pra percorrer as colunas mas não deu certo
        while(output.next()){
            String nome = output.getString(1);
            String data = output.getString(2);
            String valor = output.getString(3);

            System.out.println("\n[NOME, DATA, VALOR]");
            System.out.println(" "+nome+"  "+data+"  "+valor+"\n");
        }

        //fechar a conexão
        mssql.close();

    } catch (SQLException sqle) {
        System.err.println("[ERRO SQL]: Falha na conexão ou erro nas instruções");
        System.err.println(sqle.getSQLState());
        System.err.println(sqle.getMessage());
    }

    }
}
