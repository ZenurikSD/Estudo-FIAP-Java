package org.zenu.interfaces;

import java.io.*;
// Eu me recuso a usar o exemplo de conta bancária de novo
/** Interface para definir a especificação de um sistema de arquivos. 
 * Todo sistema de arquivos deve ter funções para Abrir,Fechar,Ler,Escrever,Criar,Apagar arquivos e/ou diretórios.
 * 
 * A implementação disso seria dependente do sistema em questão.
*/
public interface SistemaDeArquivosInterface{
    // Constantes -----------------------------------------
    String USER_HOME = System.getProperty("user.home");

    //Métodos ---------------------------------------------
    /** @param caminho O caminho completo até o arquivo*/
    boolean abrirArquivo(String caminho) throws IOException;

    /** Recebe um caminho para abrir fluxo de leitura, enviá-lo ao
     * buffer e percorrer as linhas.
     * 
     * @param caminho O caminho completo até o arquivo
     */
    void lerArquivo(String caminho) throws IOException;

    /** Faça o necessário para fechar os fluxos de forma segura*/
    void fecharArquivo() throws IOException;



}
