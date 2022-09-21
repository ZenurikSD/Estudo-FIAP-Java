package org.zenu;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        //Formas de inicializar
        String txt1 = new String();
        txt1 = "declara (var), instancia (classe) e depois atribui (isso aqui)";

        String txt2 = new String("Instância c/ valor atribuído");

        String txt3 = "Porquê dificultar?";


        //Manipular ===========================================
        System.out.println("\nTexto3: "+txt3+"\t Chars de escape: \\ \" \'");
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

        System.out.println("\nHeap VS Pool: ");
        if(nome1 == nome2){
            System.out.println("Strings iguais (Compartilham o mesmo endereço)");
        } else {
            System.out.println("Strings diferentes (Não têm o mesmo endereço)");
        }
        
        //A classe "Autenticacao" tem um exercício de strings


        //3. Localizar ocorrências - Busca de palavras
        Scanner input = new Scanner(System.in);     //Objeto para entrada de dados
        String cores = "verde, preto, roxo";

        System.out.print("\nProcure uma cor: ");
        String cor = input.next();

        if(cores.indexOf(cor) != -1){
            System.out.println(cor+" está disponível");
        } else{
            System.out.println("Não temos "+cor+" na lista");
        }

        input.close();

        //4. Cortar e juntar strings
        String frase = new String("Não quero continuar");
        String nvfrase = frase.substring(frase.indexOf("q")); //Inicia em 'q'

        System.out.println("\nVocê disse \""+nvfrase+"\"? Então bora.");

    }
}
