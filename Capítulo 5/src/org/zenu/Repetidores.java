package org.zenu;

import java.util.Scanner;

public class Repetidores {
    public static void main(String[] args) {
        //Instância da classe Scanner para entrada de dados
        Scanner entrada = new Scanner(System.in);
        
        //while
        int x=0;
        while(x < 10){
            x += 1;
            System.out.println(x+" ");
        }

        //do while
        String resp;
        do{
            System.out.print("Digite o 1º número: ");
            int N1 = entrada.nextInt();

            System.out.print("Digite o 2º número: ");
            int N2 = entrada.nextInt();

            int soma = N1+N2;

            System.out.print(
                "\n A soma é: " + soma + "\n" +
                " --Novamente? (S/N) "
            );
            resp = entrada.next();
            resp = resp.toUpperCase();

        } while(resp.equals("S"));

        //Fecha a porta
        entrada.close();

        //for
        System.out.println("Contagem regressiva");
        for(int i=10; i>=0; i--){
            System.out.print(i+" ");
        }
    }
}
