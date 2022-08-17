package org.zenurik;                            //Pasta

public class TesteConta {                       //Arquivo
    public static void main(String[] args) {    //Método principal
        // Instâncias da classe
        Conta contaCorrente = new Conta();
        Conta contaPoupanca = new Conta();

        // Inicializar os atributos
        contaCorrente.numero = 221;
        contaCorrente.saldo  = 2048;
        contaCorrente.cliente.nome = "Zenurik";
        contaCorrente.cliente.idade = 22;

        contaPoupanca.numero = 222;
        contaPoupanca.saldo  = 158.88;
        contaPoupanca.cliente.nome = "Otávio";
        contaPoupanca.cliente.idade = 18;

    }
}
