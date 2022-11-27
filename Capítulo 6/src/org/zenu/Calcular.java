package org.zenu;

/** Classe teste para exceções */
public class Calcular {
    private float resp;

    /** Exceção checked: Você deve tratar **/
    public float dividir(int x, int y) throws IndeterminadoException{

        //Exceção unchecked
        if(y==0){
            throw new IndeterminadoException(); }
            
        resp = x/y;
        return resp;
    }
}
