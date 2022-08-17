/* Crie uma classe Conta com os atributos saldo, agência e número; e os métodos de retirar, depositar e verificar o saldo. 
Implemente dois construtores: um vazio e outro que receba todos os três atributos. 
Finalize instanciando dois objetos em uma classe separada com `main`. 
 * -------------------------------------------------- */

package org.zenurik;


// DOCUMENTAÇÃO --------------------------
/** Classe que abstrai uma Conta bancária
 * @author Zenurik
 * @version 1.0
 */

public class Conta {
    // ----[ Atributos ]--------------------------
    /** Saldo da conta */
    double saldo;
    /** Agência e número da conta */
    int agencia, numero;
    /** Instância da subclasse Cliente */
    Cliente cliente = new Cliente();


    // ----[ Construtores ]------------------------
    public Conta(){  }              //Instância vazia
    
    public Conta(double nvSaldo, int nvAgencia, int nvNumero){
        this.saldo   = nvSaldo;
        this.agencia = nvAgencia;
        this.numero  = nvNumero;    //Instância com os 3 parâmetros
    }

    // ----[ Métodos ]------------------------------
    /** Exibe o saldo atual da conta
     * @return Valor do saldo
     */
    public double verSaldo(){
        return this.saldo;    }

    /** Faz um saque 
     * @param valor O valor a ser subtraído do saldo
     */
    public void retirar(float valor){
        this.saldo -= valor;          }

    /** Deposita uma quantia na conta
     * @param deposito O valor a adicionar ao saldo
     */
    public void depositar(float deposito){
        this.saldo += deposito;            }
}
