package org.zenu;

import java.util.HashMap;
import java.util.Scanner;

/** Framework Collections - Interface Map */
public class CollectionsMap {
    public static void main(String[] args) {
        //Instância da implementação HashMap
        HashMap mapa = new HashMap<>();

        //Inserção de pares
        mapa.put(123, "HTML");
        mapa.put(111, "Javascript");
        mapa.put(222, "CSS");

        //Exibição separada
        System.out.println("Chaves: "+mapa.keySet());
        System.out.println("Valores: "+mapa.values());


        //Busca do valor através da chave
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nInsira a chave: ");
        int chave = input.nextInt();

        //Verifique se a chave existe
        if(mapa.containsKey(chave) == true){
            System.out.println("Valor: "+mapa.get(chave));
        } else {
            System.out.println("Chave inválida");
        }

        input.close();
        

    }
}
