package org.zenu.interfaces;

import java.io.*;

/** Classe que implementa a interface do sistema de arquivos */
public class Leitura implements SistemaDeArquivosInterface {

    //Atributos encapsulados
    private FileReader r_stream;
    private BufferedReader reader;
    private String linha;

    // Métodos implementados
    public boolean abrirArquivo(File caminho) throws FileNotFoundException{

        if(caminho.exists() && caminho.canRead()){
            return true;
        } else {
            return false; }
    }

    /** Único método a ser chamado é esse 
     * Chama o método para abrir o arquivo, executa, e chama o método
     * de fechamento.
    */
    public void lerArquivo(File caminho) throws IOException{
        abrirArquivo(caminho);

        r_stream = new FileReader(caminho);
        reader = new BufferedReader(r_stream);

        linha = reader.readLine();
        while(linha != null){
            System.out.println(linha);
            linha = reader.readLine();
        }

        fecharArquivo();
    }

    public void fecharArquivo() throws IOException{
        r_stream.close();
        reader.close();
    }

}
