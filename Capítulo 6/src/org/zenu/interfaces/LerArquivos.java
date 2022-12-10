package org.zenu.interfaces;

import java.io.*;

/** Teste para leitura de arquivos
 * Todo o processo é realizado dentro da classe Leitura, que foi construída seguindo a especificação da interface "SistemaDeArquivos*/
public class LerArquivos {
    public static void main(String[] args) {
        SistemaDeArquivosInterface ler = new Leitura();
        String user = SistemaDeArquivosInterface.USER_HOME;
        String caminho = user+"/Documentos/post it backup.txt";

        try{
            System.out.println("\n===[Abrindo arquivo...]===\n");
            ler.lerArquivo(caminho);
            System.out.println("\n===[Arquivo lido]===\n");

        } catch (FileNotFoundException fnf) {
            System.err.println("\nArquivo não encontrado");
            System.err.println(fnf.getMessage());

        } catch (IOException ioe){
            System.err.println("Erro na operação");
            ioe.printStackTrace();
        }
    }
}
