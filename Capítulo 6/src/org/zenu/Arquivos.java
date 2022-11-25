package org.zenu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/** Manipulação de arquivos com File/Print e Buffered */
public class Arquivos {
    public static void main(String[] args) {
        // Escrita ---------------------------------------------------
        try {
            FileWriter stream = new FileWriter("arquivo.txt");
            PrintWriter writer = new PrintWriter(stream);

            writer.println("Alguém aí?");
            writer.println("Que nome eu uso no objeto?");

            stream.close();
            writer.close();

        } catch (IOException ioe) {
            System.err.println("\n==[Erro na operação de escrita]==");
            ioe.printStackTrace();
        }

        // Leitura ---------------------------------------------------
        try {
            FileReader r_stream = new FileReader("arquivo.txt");
            BufferedReader reader = new BufferedReader(r_stream);

            System.out.println("\nLendo arquivo...\n");
            String linha = reader.readLine();

            //Percorrendo as linhas
            while(linha != null){
                System.out.println(linha);
                linha = reader.readLine();
            }

            r_stream.close();
            reader.close();


        } catch (IOException ioe) {
            System.err.println("\n==[Erro na operação de leitura]==");
            ioe.printStackTrace();
        }


    }
}
