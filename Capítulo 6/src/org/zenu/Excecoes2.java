package org.zenu;

public class Excecoes2 {
    public static void main(String[] args) {
        Calcular calc = new Calcular();

        System.out.println("Divida 2 números: ");

        //Teste para 'throws Exception'
        try {
            System.out.println(calc.dividir(5, 0));
        } catch (Exception e) {
            System.err.println("Erro ao dividir: ");
            e.getStackTrace();
        }
    }
}
