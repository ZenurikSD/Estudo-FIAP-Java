package org.zenu;                                   //Pasta

public class Testes{                                //Arquivo
    public static void main(String[] args) {        //Execução principal

    //1. Instância vazia. É uma conta genérica ou corrente?
        SupConta corrente = new SupConta();

        //Vamos descobrir Se é uma instância da super ou subclasse
        if (corrente instanceof SubCCorrente){
            System.out.println("\nvar 'corrente' faz referência à objeto do tipo Conta");
        } else {
            System.out.println("\nvar 'corrente' NÃO É do tipo Conta ");
        }


        corrente.retirar(2500);
    }
    
}
