package org.zenu;

import java.util.ArrayList;

/** Framework Collections #1 - Interface List */
public class CollectionsList {
    public static void main(String[] args) {
        /* Listas têm como principal implementação a classe ArrayList 
         * - O VSCode mostra um problema se não usar os 
         *   'parâmetros de tipo': <> na instância.
         *   Eu pensei que o curso tava ensinando errado mas eles só 
         *   incluem esse "detalhe" no código bem depois.
         * Eles deviam ter falado desse problema antes, eu fui pesquisar de besta
        */
        ArrayList lista = new ArrayList();
        lista.add("Panetone");
        lista.add("de");
        lista.add("Uva passa");

        lista.set(2,"Frutas");   //Substitui a posição 2

        //Exibe a lista
        for (int l=0; l<lista.size(); l++) {
            System.out.println(lista.get(l));
        }

        //Busca um item
        int indice = lista.indexOf("Uva passa");
        if(indice != -1){
            System.out.println("\nO panetone tem uva passa");         
        } else{
            System.out.println("\nNão tem uva passa?!");
        }


    }
}
