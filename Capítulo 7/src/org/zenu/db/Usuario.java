package org.zenu.db;

import java.util.Calendar;

/** Classe encapsulada que representa um registro da tabela testeJDBC.dbo.usuario.
 * Insira os atributos em uma nova instância
 */
public class Usuario {
    //Atributos
    private int id;
    private String nome;
    private Calendar data;
    private int valor;

    //Construtores
    /** Construtor vazio do Usuário */
    public Usuario(){
        super();
    }
    
    /** Construtor com atributos dessa classe Usuário. 
     * Forneça os atributos para registro 
     * <p>Propositalmente sem ID. Deixa o SQL definir a numeração</p>*/
    public Usuario(String nome, Calendar data, int valor){
        this.nome = nome;
        this.data = data;
        this.valor = valor;
    }

    /** Construtor com atributos dessa classe Usuário. 
     * Uso exclusivo dos métodos internos.*/
    protected Usuario(int id, String nome, Calendar data, int valor){
        this.id = id;
        this.nome = nome;
        this.data = data;
        this.valor = valor;
    }


    //Métodos getters e setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getData() {
        return data;
    }
    public void setData(Calendar data) {
        this.data = data;
    }

    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }




}
