package zenurik;                                //Pasta zenurik

public class Operadores2 {                      //Arquivo Operadores2.java
    public static void main(String[] args) {    //Método principal
        //Operadores relacionais e lógicos

        int a=8, b=4, c=3;  //Eficiência mlk

        //Para fazer a relação, é preciso definir em uma variável booleana;
        // a == c    não vai fazer nada;
        boolean dif = c != a;
        boolean geq = b >= a;
        boolean mai = a > c;
        System.out.println("Diferente?   "+dif);
        System.out.println("Maior/Igual? "+geq);
        System.out.println("Maior?       "+mai);

        //Lógicos
        int idade=20, x=2;
        boolean voto  = idade>18 && idade<70;       // AND  &&  um E outro 
        boolean teste = x<10 || x>50;               // OR   ||  um OU outro
        boolean xor   = idade<10 ^ x<4;             // XOR  ^   um OPOSTO ao outro
        boolean inverte = !(idade>18);              // NOT  !   negação

        System.out.println("Tem idade para votar? "+voto);
        System.out.println("<10 e >50:        "+teste);
        System.out.println("Ou Exclusivo:     "+xor);
        System.out.println("Não é Idade>18:   "+inverte);
    }

}
