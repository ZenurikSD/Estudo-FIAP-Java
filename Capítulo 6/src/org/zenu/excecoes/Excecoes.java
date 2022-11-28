package org.zenu.excecoes;           //Pasta, pacote

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecoes {     //Arquivo, Classe
    public static void main(String[] args) {        //Excecução
        Scanner in = new Scanner(System.in);

        System.out.println("Digite 2 números:");

        //Monitore por duas exceções:
        try {
            int x = in.nextInt();
            int y = in.nextInt();
            float div = x/y;
            System.out.println("Divisão: "+div);
            
        } catch (ArithmeticException ae) {
            System.err.println("Erro na divisão: ");
            System.err.println(ae.getMessage());

        } catch (InputMismatchException ime){
            System.err.println("Isso não é um número 🤨");
            
        } finally{
            System.out.println("Fechando Scanner...");
            in.close();
        }

    }
}
