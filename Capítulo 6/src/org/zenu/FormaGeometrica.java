package org.zenu;

/** Classe abstrata para definição de formas geométricas */
public abstract class FormaGeometrica {

    private String medida;

    /** Método abstrato para cálculo de área */
    public abstract double calcularArea();

    /** Métodos concretos (get e set) pois a implementação 
     * da medida é igual para todas as formas geométricas.
     * 
     * @return A unidade de medida definida
     */
    public final String getMedida(){
        return this.medida; }
    public final void setMedida(String m){
        this.medida = m; }
}
