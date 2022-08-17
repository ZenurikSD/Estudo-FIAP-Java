package org.zenurik;

import java.util.Scanner;

/** Teste prático da classe Conta - Exercício "Trabalhando com Objetos"
 * @author Zenurik
 * @version 1.0
 */
public class SistemaBancario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float valor = 0;
        int resp = 0;

        //Objetos instanciados a partir da classe
        //1. Instância vazia
        Conta cc = new Conta();  
        cc.saldo = 2350;
        cc.numero = 265;
        cc.agencia = 001;

        //1. Interação com os métodos do objeto 
        cc.depositar(150);
        System.out.println(cc.verSaldo());


        //2. Instância com os 3 parâmetros definidos
        Conta poupanca = new Conta(1000,002,355);

        //2. Interação mais elaboada: Feita pelo usuário
        // Menu bem limitado pois não sei limpar a saída ainda
        System.out.println("------------------------------------");
        while(resp != 3){
            System.out.println("\nConta poupança: ");
            System.out.println(
                " Saldo:   R$ "+poupanca.verSaldo()+"\n" +
                " Agência: "+poupanca.agencia +"\n" +
                " Conta:   "+poupanca.numero  +"\n"  );
        
            System.out.println("O que deseja fazer? ");
            System.out.println(
                " 1. Depósito" + "\n" +
                " 2. Saque"    + "\n" +
                " 3. --> Sair"    + "\n"   );
            resp = entrada.nextInt();

            if(resp == 1){
                System.out.print(" Digite o valor a depositar: R$ ");
                valor = entrada.nextFloat();
                poupanca.depositar(valor);

                } else if(resp == 2){
                    System.out.print(" Digite o valor para retirar: R$ ");
                    valor = entrada.nextFloat();
                    poupanca.retirar(valor);

                    } else if(resp == 3){
                        break;
            } else {
                System.out.println("Opção inválida");  }
        }

        entrada.close();
    }
}
