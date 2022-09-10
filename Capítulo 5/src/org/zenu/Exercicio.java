package org.zenu;

import java.util.Scanner;

/** Disciplina e Aluno */
public class Exercicio {
    public static void main(String[] args) {
        //Instanciamentos
        String grade2[][] = new String[2][2];
        Scanner input = new Scanner(System.in);

        //Preenchimento da matriz
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print("Posição["+i+"]["+j+"]: ");
                grade2[i][j] = input.nextLine();
            }
        }

        //Exibição?
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(grade2[i][j]+" | ");
            }
            System.out.println();
        }

        input.close();
    }
}
