package org.zenurik;

import java.util.Scanner;

public class Cliente1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float valor = 0;
        int resp = 0;

    //1. Objetos instanciados a partir da classe
        //Instância vazia
        Conta cc = new Conta(){ };  
        cc.saldo = 2350;
        cc.numero = 265;
        cc.agencia = 001;
        
        //Instância com parâmetros definidos
        Conta poupanca = new Conta(200,002,355); 
        

    //2. Interação com os métodos do objeto
    // Menu bem limitado pois não sei limpar a saída ainda
        while(resp != 3){
            System.out.println("\nConta poupança: ");
            System.out.println(
                " Saldo:   R$ "+poupanca.verSaldo()+"\n" +
                " Agência: "+poupanca.agencia +"\n" +
                " Conta:   "+poupanca.numero  +"\n"  );
        
            System.out.println("\n"+"O que deseja fazer? ");
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
