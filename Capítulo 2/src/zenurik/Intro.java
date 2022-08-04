package zenurik; //Faz parte do pacote (pasta) zenurik

public class Intro { //Classe (arquivo .java) pública chamada Intro
// ------------------------------------------------------------
//Variáveis:
	//Inteiras
	int populacao_cinesa;   //4 bytes (2bi máx)
	short municipios_sp;	//2 bytes (32 k)
	long estrelas_no_ceu;	//8 bytes (9 quintilhões máx)
	byte cores_rgb;			//1 byte (256)

	//Reais
	float dinheiro;			//4 bytes
	double muito_dinheiro; 	//8 bytes (dobra a precisão decimal)

	//Caracteres
	char letra; 			//Só 1 mesmo

	//Booleano:
	boolean cansado = true;	//Verdadeiro ou falso
// ------------------------------------------------------------
//Método principal, a execução sempre começa aqui
	public static void main(String[] args) {
		
		System.out.println("Salve quebrada");
		//Classe.campo.método( argumentos )

		int idade = 22;
		double conta_bancaria = 1225120990.9560;
		char genero = 'M';
		boolean responsavel = false;

		System.out.println(idade);
		System.out.println(genero);
		System.out.println(responsavel);
		System.out.println(conta_bancaria);
	}

}