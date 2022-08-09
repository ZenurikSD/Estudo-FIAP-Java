package zenurik;                             //Pasta zenurik

public class Conversoes {                    //Arquivo Conversoes.java
   public static void main(String[] args) {  //Método principal
      //Simples: De inteiro para real/grande
      int      x = 10;
      double   d = x;
      long     l = x;
      float    f = x;

      System.out.printf("Print formatado \nSe eu soubesse colocar as variáveis aqui eu colocaria\n");

      //"Cast to": Conversão explícita.
      // De real grande para inteiro
      double valorReal = 42.0254216945;
      int valorInt = (int) valorReal;

      System.out.println(valorInt);


   }
}
