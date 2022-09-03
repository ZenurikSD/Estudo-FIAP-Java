package org.zenu;

public class Cachorro extends Animal{   //Subclasse animal
    //Atributos específicos
    private String latido;

    //Construtor vazio

    //Métodos de acesso e modificação
    public String getLatido(){
        return latido;
    }
    public void setLatido(String som){
        this.latido = som;
    }
    
}
