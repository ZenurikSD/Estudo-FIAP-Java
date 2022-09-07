package org.zenu;

import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        //Instancia a classe e depois atribui
        int[] n_pares = new int[4];
        n_pares[0] = 8;
        n_pares[1] = 6;
        n_pares[2] = 4;
        n_pares[3] = 10;

        //Declaração e atribuição juntos
        int ano_copa[] = {2010,2014,2018,2022};
        int n_primos[] = new int[]{2,3,5,7,11};

        //Tipos de dados aceitos em vetores: 
        byte bytes[] = new byte[2];         //Primitivos
        short shorts[] = new short[3];
        double doubles[] = new double[4];
        float floats[] = new float[5];
        
        String textos[] = new String[3];    //Referências
        Aluno turma[] = new Aluno[25];

        
    /* Exercício:
     * Armazene as notas de uma turma de 10 alunos e calcule sua média.
     */ 
        Scanner input = new Scanner(System.in);
        float notas[] = new float[10];
        float soma = 0;
        float media = 0;

        for(int i=0; i < notas.length; i++){
            System.out.print("Digite a nota do "+(i+1)+"º aluno: ");
            notas[i] = input.nextFloat();
            soma += notas[i];                //Incrementa a nota atual em uma soma
        }
        
        media = soma / notas.length;
        System.out.println("A média de notas dos alunos é: "+media);
        
        input.close();
    }
}
