package org.zenu;

/** Classe teste para exceções */
public class Calcular {
    private float resp;

    //Exceção checked: Você deve tratar
    public int dividir(int x, int y) throws Exception{
        resp = x/y;
        return 0;
    }
}
