package org.zenu;               //Pasta

public class Animal {           //Arquivo class
    
    //Atributos encapsulados
    private String locomove;
    private String alimenta;

    //Construtor vazio padrão

    //Métodos de acesso e modificação
    public String getLocomove(){
        return locomove; 
    }
    public void setLocomove(String locomocao){
        this.locomove = locomocao;
    }
    public String getAlimenta(){
        return alimenta;
    }
    public void setAlimenta(String comida){
        this.alimenta = comida;
    }
    
}
