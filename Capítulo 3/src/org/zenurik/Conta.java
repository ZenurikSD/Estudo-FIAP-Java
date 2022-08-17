/* TRABALHANDO COM OBJETOS:
 * Crie uma classe Conta com os atributos saldo, agência e número; e os métodos de retirar, depositar e verificar o saldo. 
 * Implemente dois construtores: um vazio e outro que receba todos os três atributos. 
 * Finalize instanciando dois objetos em uma classe separada com `main`. 
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
    /** Cria uma instância vazia */
    public Conta(){  }
    
    /** Cria uma instância com todos os parâmetros
     * @param nvSaldo O novo saldo para a instância
     * @param nvAgencia A nova para a instância
     * @param nvNumero O novo número para a instância
     */
    public Conta(double nvSaldo, int nvAgencia, int nvNumero){
        this.saldo   = nvSaldo;
        this.agencia = nvAgencia;
        this.numero  = nvNumero;
    }


    // ----[ Métodos ]------------------------------
    /** Exibe o saldo atual da conta
     * @return Valor do saldo
     */
    public double verSaldo(){
        return this.saldo;   }

    /** Faz um saque 
     * @param valor O valor a ser subtraído do saldo
     */
    public void retirar(double valor){
        this.saldo -= valor;          }

    /** Faz um saque com juros
     * @param valor O valor a ser retirado
     * @param taxa Juros a pagar
     */
    public void retirar(double valor, float taxa){
        this.saldo -= valor - taxa;               }

    /** Deposita uma quantia na conta
     * @param valor O valor a adicionar ao saldo
     * @see depositar
     */
    public void depositar(float valor){
        this.saldo += valor;           }
}
