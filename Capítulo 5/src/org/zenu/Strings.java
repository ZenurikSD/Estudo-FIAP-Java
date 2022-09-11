package org.zenu;

public class Strings {
    public static void main(String[] args) {
        //Formas de inicializar
        String txt1 = new String();
        txt1 = "declara (var), instancia (classe) e depois atribui (isso aqui)";

        String txt2 = new String("Instância c/ valor atribuído");

        String txt3 = "Porquê dificultar?";


        //Manipular ===========================================
        System.out.println("\nTexto3: "+txt3+"\t \\ \" \'");
        System.out.println("Tamanho: "+txt3.length()+"\n");

        //1. Concatenação
        String nome = "Zenurik", atividade = "está estudando";
        String status = nome+" "+atividade;                     //Via soma
        System.out.println(status);

        String ativ2 = "e ouvindo um vídeo.";
        status += " "+ativ2;                                    //Via atribuição
        System.out.println(status);

        String outro = "Só isso mesmo.";
        System.out.println(status.concat(" "+outro)+"\n");      //Via concat()


        //2. Comparação
        if(atividade.equals(outro)){
            System.out.println("Strings iguais");
        } else {
            System.out.println("Strings diferentes");
        }

        // -- Teste Heap vs Pool
        String nome1 = new String("Ali");
        String nome2 = new String("Ali");   // {Heap de memória}
        // String nome1 = "Ali";
        // String nome2 = "Ali";                         // {Pool de strings}
        
        if(nome1 == nome2){
            System.out.println("\nStrings iguais (Compartilham o mesmo endereço)");
        } else {
            System.out.println("\nDiferentes (Não têm o mesmo endereço)");
        }
        
    }
}
