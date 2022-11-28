package org.zenu.excecoes;

import java.util.Scanner;

import org.zenu.Calcular;

public class Excecoes2 {
    public static void main(String[] args) {
        Calcular calc = new Calcular();

        Scanner input = new Scanner(System.in);

        System.out.println("Divida 2 números: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        //Teste para 'throws Exception'
        try {
            System.out.println(calc.dividir(n1, n2));

        } catch (IndeterminadoException ie) {
            System.err.println("\nImpossível dividir por zero!");
            ie.getClass();

        } finally{
            input.close();
        }

    }
}
