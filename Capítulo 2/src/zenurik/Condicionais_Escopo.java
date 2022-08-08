package zenurik;                                //Pasta zenurik

public class Condicionais_Escopo {              //Arquivo (classe) .java
    public static void main(String[] args){     //Método principal
        int n = 2;

        if(n>10){
            System.out.println("Maior que 10");
        } else if(n==10){
            System.out.println("Igual a 10");
        } else{
            System.out.println("Menor que 10");
        }
    }
}
