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

		float exprs = z + x - y / (x*y);

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

		//Incrementos e decrementos ANTES e DEPOIS
		z=10; x=2; y=2;
		//------ DEPOIS: z recebe 2 (atribui DEPOIS incrementa x)
		z = x++;	
		System.out.println("z = "+z);
		System.out.println("x = "+x);
		//------ ANTES: z recebe 1 (decrementa y ANTES de atribuir)
		z = --y;
		System.out.println("z = "+z);
		System.out.println("y = "+y);

		//Concatenar string + variável no println()
		System.out.println("Valor Z: " + z);
	}
	
}
