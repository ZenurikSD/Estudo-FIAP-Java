/* Classe encapsulada: Atributos são privados e estou usando o construtor para definir ou acessar os valores deles através de métodos "set" e "get"
 * -------------------------------------------------- */

package org.zenurik;


// DOCUMENTAÇÃO --------------------------
/** Classe encapsulada (Javabean) que abstrai uma Conta bancária
 * @author Zenurik
 * @version 1.0
 */

public class ContaEncap {
// ----[ Atributos ]---------------------
    /** Saldo da conta */
    private double saldo;
    /** Agência e número da conta */
    private int agencia, numero;


// ----[ Construtores ]-------------------
    public ContaEncap(){  }              //Instância vazia
    
    public ContaEncap(int agencia, int numero /*, double saldo*/){
        this.setAgencia(agencia);
        this.setNumero(numero);
        //this.setSaldo(saldo);           
        /* O setSaldo() não existe pois ele não é definido como os outros:
         * só pode ser modificado ao depositar() ou retirar().
         */
    }

// ----[ Métodos de modificação ]--------------
    /** Define uma nova agência e a salva no atributo privado
     * @param nvAgencia  */
    public void setAgencia(int nvAgencia){      
        this.agencia = nvAgencia;
    }

    /** Define um número da conta e o salva no atributo privado
     * @param nvNumero  */
    public void setNumero(int nvNumero){
        this.numero = nvNumero;
    }


// ----[ Métodos de acesso ]--------------
    /** Retorna o número atual da agência
     * @return  agência*/
    public int getAgencia(){
        return agencia;
    }

    /** Retorna o número atual da conta
     * @return  número*/
    public int getNumero(){
        return numero;
    }

    /** Retorna o saldo atual da conta
     * @return  saldo*/
    public double getSaldo(){
        return saldo;
    }


// ----[ Métodos ]-------------------
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
