/* Hereditariedade #2
 * Trabalhando com superclasses e subclasses em classes encapsuladas
 */

package org.zenu;

/** Subclasse herdeira da superclasse Conta */
public class SubCCorrente extends SupConta {
    /**Tipo da conta:
     * Básica, especial ou premium
     */
    private String tipo;
    private double cheque_esp;

    
    //Métodos específicos
    /**Saldo da conta corrente
     * Se apoia no método da superclasse para retornar o saldo da conta + cheque especial.
     * @return saldo da conta corrente
     */
    public double getSaldoCC(){
        return getSaldo() + this.cheque_esp;
    }


    //Métodos de acesso 
    public String getTipo(){
        return tipo;
    }
    public double getChequeEsp(){
        return cheque_esp;
    }


    //Métodos de modificação
    public void setTipo(String nvTipo){
        this.tipo = nvTipo;
    }
    public void setChequeEsp(double valor){
        this.cheque_esp = valor;
    }
}
