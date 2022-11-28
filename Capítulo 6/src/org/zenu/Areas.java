package org.zenu;

public class Areas {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.setRaio(3);
        circulo.setMedida("cm");

        System.out.println(
            "Área do círculo: "+
            circulo.calcularArea()+
            circulo.getMedida()+"²"
        );
    }
}
