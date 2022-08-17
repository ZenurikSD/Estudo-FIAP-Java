package org.zenurik;                            //Pasta

/** Teste da classe Conta com subclasse Cliente
 * @author Zenurik
 * @version 1.0
 */
public class TesteConta {                       //Arquivo
    public static void main(String[] args) {    //Método principal
        // Instâncias da classe
        Conta contaCorrente = new Conta();
        Conta contaPoupanca = new Conta(125.52, 003, 221);

        // Inicializar os atributos
        contaCorrente.numero = 221;
        contaCorrente.saldo  = 2048;
        contaCorrente.cliente.nome = "Zenurik";
        contaCorrente.cliente.idade = 22;

        contaPoupanca.cliente.nome = "Otávio";
        contaPoupanca.cliente.idade = 33;

    }
}
