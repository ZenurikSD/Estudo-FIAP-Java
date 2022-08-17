package org.zenurik;

/** Teste da classe Conta encapsulada
 * @author Zenurik
 * @version 1.0
 */

public class TesteContaEncap {
    public static void main(String[] args) {  //Execução principal

        //Instância vazia da classe ContaEncap
        ContaEncap cc = new ContaEncap();
        cc.setAgencia(001);
        cc.setNumero(3211);
        cc.depositar(1450);

        System.out.println("\n===[Conta corrente]=============");
        System.out.println("Agência:         "+cc.getAgencia());
        System.out.println("Número da conta: "+cc.getNumero());
        System.out.println("Saldo atual:     R$ "+cc.getSaldo());


        //Instância com parâmetros de entrada
        ContaEncap poupanca = new ContaEncap(002, 1122);
        poupanca.depositar(2022);

        System.out.println("\n===[Conta poupança]=============");
        System.out.println("Saldo atual:     R$ "+poupanca.getSaldo()+"\n");
    }
}
