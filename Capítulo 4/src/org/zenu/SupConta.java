/* Hereditariedade #1
 * Trabalhando com superclasses e subclasses em classes encapsuladas
 */

package org.zenu;
import java.io.Serializable;

/** Conta superclasse encapsulada
 * @version 1.0
 * @author Zenurik
 */
public class SupConta implements Serializable {
    private static final long serialVersionUID = 1L;

    //Atributos encapsulados
    private byte agencia;
    private int numero;
    private double saldo;


    //Métodos de acesso
    public byte getAgencia(){
        return agencia; 
    }
    public int getNumero(){
        return numero; 
    }
    public double getSaldo(){
        return saldo; 
    }


    //Métodos de modificação
    public void setAgencia(byte nvAgencia){
        this.agencia = nvAgencia; 
    }
    public void setNumero(int nvNumero){
        this.numero = nvNumero;  
    }
    public void depositar(double valor){
        this.saldo += valor;
    }
    public void retirar(double valor){
        this.saldo -= valor;
    }
}
