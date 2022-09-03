package org.zenu;                                   //Pasta

public class Testes{                                //Arquivo
    public static void main(String[] args) {        //Execução principal

    //1. Instância vazia. É uma conta genérica ou corrente?
        SubCCorrente corrente = new SubCCorrente();

        //Vamos descobrir Se é uma instância da super ou subclasse
        if (corrente instanceof SupConta){
            System.out.println("\nvar 'corrente' faz referência à objeto do tipo Conta");
        } else {
            System.out.println("\nvar 'corrente' NÃO É do tipo Conta");
        }

        
    //2. Implemente uma conta corrente e utilize o método de retirar específico à ela
        //Instância da subclasse com variável de referência para a superclasse
        SupConta contaC = new SubCCorrente((byte) 001, 2310, "básica");

        //"Cast to subclass" - Para acessar o método @override
        SubCCorrente cc = (SubCCorrente) contaC;
    
        cc.depositar(300);
        cc.setChequeEsp(100);   // 400 disponível
        cc.retirar(250);        // -260 (10 taxa) == 14

        System.out.println("\nSaldo conta corrente: R$ "+cc.getSaldo());
    
    }
    
}
