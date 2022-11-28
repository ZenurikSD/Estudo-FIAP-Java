package org.zenu;

/**Subclasse círculo implementa classe abstrata FormaGeometrica */
public class Circulo extends FormaGeometrica{
    
    private double raio;

    /**Cálculo da área do círculo */
    @Override
    public double calcularArea(){
        return Constantes.PI*(raio*raio);
    }

    /** @return Raio do círculo */
    public double getRaio() {
        return raio; }

    /** Armazena um novo raio */
    public void setRaio(double raio) {
        this.raio = raio; }
}
