package zenurik;           						//Pasta zenurik

public class Operadores {  						//Arquivo Operadores.java
	public static void main(String[] args){		//Método principal
		int x = 5;
		int y = 2;
		int z = 3;

		int adicao = x+y;
		int subtracao = x-y;
		float multi = x*y;
		float divisao = x/y;
		float resto = x%y;

		float exprs = z + (x*y);

		//printf() em linhas separadas
		// Printf("string %formato", var/argumentos)
		System.out.printf(
			"Adição: %d\nSubtração: %d\n", adicao, subtracao);
		System.out.printf(
			"Multi: %f\nDiv: %f\n", multi, divisao);
		System.out.printf(
			"Resto: %f\nExpressão: %f\n", resto, exprs);
		
		//Operadores de atribuição, incrementos e decrementos
		z = 8;
		z = z + 10; //Adicionar 10 à variável
		z+= 10; 	//Mesma coisa
		z++; z--; 	//Incrementa 1, decrementa 1

		//Concatenar string + variável no println()
		System.out.println("Valor Z: " + z);
	}
	
}
