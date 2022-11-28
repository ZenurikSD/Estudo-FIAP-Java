package org.zenu;

import java.io.*;

public class Scraping {
    public static void main(String[] args) {
        /* Pensei numa ideia "legal": Vou roubar dados do meu próprio sistema
         * copiando uma chave privada SSH e enviando-a para um arquivo separado.
         * Assumindo que o arquivo da chave tem exatamente esse nome.
         * 
         * Não deve ser difícil achar um comando pra descobrir o usuário 
         * (achei lol) e simplesmente copiar tudo da pasta.
         */

        String user = System.getProperty("user.home");
        File caminho = new File(user, ".ssh/id_ed25519");

        if(caminho.exists() && caminho.canRead()){
            System.out.println("\nChave privada encontrada. Iniciando cópia...");

            try {
                FileReader r_stream = new FileReader(caminho.getAbsolutePath());
                BufferedReader reader = new BufferedReader(r_stream);

                FileWriter w_stream = new FileWriter(
                    user+"/Documentos/chaveSSH.txt"
                );
                PrintWriter writer = new PrintWriter(w_stream);

                //Lê o arquivo linha por linha e salva na cópia
                String linha = reader.readLine();

                while(linha != null){
                    writer.println(linha);
                    linha = reader.readLine();
                }
                
                //CLOSE THE GATES!
                r_stream.close();
                reader.close();
                w_stream.close();
                writer.close();

            } catch (IOException ioe) {
                System.err.println("Falha na cópia do arquivo\n");
                ioe.printStackTrace();
            }

            System.out.println("Chave pescada com sucesso\n");

        } else {
            System.out.println(
                "\nEsse caminho não existe ou você não tem permissão pra leitura\n"
            );
        }
    }
}
