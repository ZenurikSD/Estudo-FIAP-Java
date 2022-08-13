/* Crie uma classe Conta com os atributos saldo, agência e número; e os métodos de retirar, depositar e verificar o saldo. Implemente dois construtores: um vazio e outro que receba todos os três atributos. Finalize instanciando dois objetos em uma classe separada com `main`. */
package org.zenurik;

public class Conta {
    double saldo;
    int agencia, numero;

    // ----[ Construtores ]-------------------
    public Conta(){  }              //Instância vazia
    
    public Conta(double nvSaldo, int nvAgencia, int nvNumero){
        this.saldo   = nvSaldo;
        this.agencia = nvAgencia;
        this.numero  = nvNumero;    //Instância com os 3 parâmetros
    }

    // ----[ Métodos ]-------------------
    public double verSaldo(){
        return this.saldo;    }

    public void retirar(float valor){
        this.saldo -= valor;          }

    public void depositar(float deposito){
        this.saldo += deposito;            }
}
