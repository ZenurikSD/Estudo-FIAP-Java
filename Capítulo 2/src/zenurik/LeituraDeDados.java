package zenurik;                                //Pasta

import java.util.Scanner;                       //Importar a classe do pacote java.util

public class LeituraDeDados {                   //Arquivo / classe
    public static void main(String[] args){     //Método principal
    //Entrada de dados - Classe Scanner
        //1. Constrói nova instância que lê o fluxo de entrada especificado
        Scanner entrada = new Scanner(System.in);

        //2. Utiliza esse objeto com um método específico para ler
        System.out.println("Digite seu nome completo, idade, altura e uma cor");

        String nome  = entrada.nextLine();      //Lê texto (incluindo espaços)
        int idade    = entrada.nextInt();       //Lê um valor inteiro
        float altura = entrada.nextFloat();     //Lê um real
        String cor   = entrada.next();          //Lê texto (uma palavra)

        System.out.println(nome+", "+idade+". "+altura+"m");
        System.out.println(cor);

        //3. Fecha a instância da classe
        //entrada.close()  ----  Eu fechei lá em baixo

    //[Exercício] Leia 2 números e some-os. Mostre se a soma é par ou ímpar.
        System.out.println("Digite 2 números para somar:");
        int N1 = entrada.nextInt();
        int N2 = entrada.nextInt();

        int soma = N1 + N2;

        if(soma%2 == 0){
            System.out.println(soma+" é par");
        }else{
            System.out.println(soma+" é ímpar");
        }

    /*[Exercício] Cálculo do IMC - Calcule e exiba se está ou não no peso ideal
     * Fórmula = peso / altura²;  Ideal entre 18.5 e 25 */
        System.out.println("Cálculo do IMC - Digite seu peso");
        float peso = entrada.nextFloat();
        //Altura já foi salva, reaproveitando

        double imc = peso / (altura*altura);
        
        if(imc>=18.5 && imc<=25){
            System.out.println("IMC de "+imc+" está na faixa ideal");
        }else{
            System.out.println("IMC de "+imc+" NÃO está na faixa ideal");
        }
     


    /*[Exercício] Pergute a idade e exiba a categoria da pessoa
      (Menor ou maior de idade, idoso, centenário)  */
        System.out.print("Fala a idade de novo, eu esqueci: ");        
        idade = entrada.nextInt();


        if(idade<18){
            System.out.println("Menor de idade");

        } else if(idade>=18 && idade<70){
            System.out.println("Maior de idade");

            if(idade<30) {System.out.println(" e Jovem adulto"); }
        } else {
            System.out.println("Idoso");

            if(idade>=100) {System.out.println(" e Centenário"); }
        }


        entrada.close(); 
    }
    
}
