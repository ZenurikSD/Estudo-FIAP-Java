package zenurik; //Faz parte do pacote (pasta) zenurik

public class Intro { //Classe (arquivo .java) pública chamada Intro
// ------------------------------------------------------------
//Variáveis:
	//Inteiras
	int populacao_cinesa;   //4 bytes (2bi máx)
	short municipios_br;	//2 bytes (32 k)
	long estrelas_no_ceu;	//8 bytes (9 quintilhões máx)
	byte cores_rgb;			//1 byte (256)

	//Reais
	float dinheiro;			//4 bytes
	double muito_dinheiro; 	//8 bytes (dobra a precisão decimal)

	//Caracteres e Strings
	char letra; 			//Só 1 mesmo
	String texto;			//A String não é um tipo primitivo, é uma classe. 
							//É equivalente a criar uma sequência (array) de chars.

	//Booleano:
	boolean cansado = true;	//Verdadeiro ou falso

// ------------------------------------------------------------
//Método principal, a execução sempre começa aqui
	public static void main(String[] args) {
		
		System.out.println("Salve quebrada");
		//Classe.campo.método( argumentos )

		byte idade = 22;
		double conta_bancaria = 1225120990.9560;
		char genero = 'M';
		String nome = "Zenurik";
		boolean responsavel = false;

		System.out.println(nome+", "+idade+", "+genero);
		System.out.println(responsavel);
		System.out.println(conta_bancaria);
	}

}