package org.zenu;

import java.util.Scanner;

/** Exercício de autenticação de usuário. 
 * <br> Se por algum motivo alguém ver isso no futuro, esclareço 
 * que eu que crio esses exercícios,o curso da FIAP não passa nenhum :\
 */
public class Autenticacao {
    public static void main(String[] args) {
        //Instância da classe Scanner para entrada de dados
        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Faça seu login: ");

        System.out.print("Usuário: ");
        String user = new String(input.nextLine());

        System.out.print("Senha: ");
        String pass = new String(input.nextLine());

        /* Autenticação simples
         * - Coincidência exata de usuário
         * - Testar a senha: tamanho e posição de caractere
         *    Não precisa ser exatamente igual, eu quero testar
         *    uns caracteres de validação.
         *    tamanho: 4 chars (3 letras e o nº 0 no final)
         */

        if(user.equals("ZenurikSD")){

            boolean tamanho = pass.length() == 4;           //Tamanho = 4?
            boolean tnomeio = pass.charAt(2) == 't'; //T na posição 3? 
            boolean posicao = pass.endsWith("0");   //Termina com zero?

            if(tamanho && tnomeio && posicao == true){
                System.out.println("--> Senha confirmada. Bem vindo, Zenurik!");
            }else{
                System.out.println("Senha incorreta, tente novamente."); }

        }else{
            System.out.println("Usuário não cadastrado, tente novamente"); }

        /* Ficaria mais elegante se eu separasse esse condicional no próprio
         * método e usasse um loop para repetir a entrada conforme o retorno. 
         * Eu até tenho ideia de como fazer, mas não chegamos lá ainda.
         */

        input.close();

    }
}
