package org.zenurik;

public class Teste2 {
    public static void main(String[] args) {  //Execução principal

        //Instância vazia da classe ContaEncap
        ContaEncap corrente = new ContaEncap();
        corrente.setAgencia(001);
        corrente.setNumero(3211);
        corrente.depositar(1450);

        System.out.println("\n===[Conta corrente]=============");
        System.out.println("Agência:         "+corrente.getAgencia());
        System.out.println("Número da conta: "+corrente.getNumero());
        System.out.println("Saldo atual:     R$ "+corrente.getSaldo());


        //Instância com parâmetros de entrada
        ContaEncap poupanca = new ContaEncap(002, 1122);
        poupanca.depositar(2022);

        System.out.println("\n===[Conta poupança]=============");
        System.out.println("Saldo atual:     R$ "+poupanca.getSaldo()+"\n");
    }
}
