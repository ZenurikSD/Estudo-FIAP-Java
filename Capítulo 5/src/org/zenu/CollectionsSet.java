package org.zenu;

import java.util.HashSet;

/** Framework collections - Interface Set */
public class CollectionsSet {
    public static void main(String[] args) {
        /* Instância da classe HashSet
         * Cria uma tabela hash para armazenar elementos do conjunto.
         */
        HashSet conjunto = new HashSet();

        conjunto.add("Java");
        conjunto.add("C++");
        conjunto.add("Python");

        conjunto.add("Java");   //Repetido!

        System.out.println(
            "\n"+conjunto.size()+" elementos: "+conjunto+"\n"
        );

        //Buscar um elemento
        // Como se trata de uma tabela hash, ele não usa 'indexOf()' para busca.
        if(conjunto.contains("Java")){
            System.out.println("Achei Java!");
        } else {
            System.out.println("Sem Java 😞");
        }
    }
}
