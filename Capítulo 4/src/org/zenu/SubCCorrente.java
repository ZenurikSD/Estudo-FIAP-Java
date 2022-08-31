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


    //Construtores
    public SubCCorrente(){ }

    /** Instância da subclasse SubCCorrente com parâmetros
     * @param nvTipo Tipo de conta (básica, especial ou premium)
     * @param valCheq Valor do limite de cheque especial
     */
    public SubCCorrente(String nvTipo, double valCheq){
        this.tipo = nvTipo;
        this.cheque_esp = valCheq;
    }

    
    //Métodos específicos
    /**Saldo da conta corrente
     * Se apoia no método da superclasse para retornar o saldo da conta + cheque especial.
     * @return saldo da conta corrente
     */
    public double getSaldoCC(){
        return getSaldo() + this.cheque_esp;
    }

    /** Saque com cheque especial.
     * Sobrescreve o método da superclasse para adicionar uma taxa ao saque, e então o utiliza para fazer a retirada.
     */
    @Override
    public void retirar(double valor){
        valor += 10;  //Adiciona a taxa ao valor da retirada
        super.retirar(valor);
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
