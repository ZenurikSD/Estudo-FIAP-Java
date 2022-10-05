package org.zenu;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**Coleções com parâmetro de tipo 
 * <br> https://docs.oracle.com/javase/tutorial/java/generics/why.html
*/
public class Generics {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        ArrayList tudo = new ArrayList();

        //Lista aceita qualquer tipo primitivo ou de referência
        tudo.add("String");
        tudo.add(147334);
        tudo.add(aluno);

        //Mas como se recupera os valores na sua forma original?
           // String txt = tudo.get(0);  
        //^ Erro pois a posição 0 tem um objeto, não uma string. 
        //É preciso realizar cast:
        String txt = (String) tudo.get(0);
        //Definindo o tipo aceito logo de cara, isso não é necessário.
        
        
        //Generics ============================================
        //1. ArrayList de diferentes tipos  -------------------
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Mariana");
        nomes.add(null);

        ArrayList<Aluno> lista_alunos = new ArrayList<Aluno>();
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        a1.setNome("Daniel");
        a2.setNome("João");
        lista_alunos.add(a1);        //Lista de objetos do tipo Aluno
        lista_alunos.add(a2);
        
        /*Exibe a lista usando for-each
         * Pega o objeto atual da lista e armazena numa var temporária usada
         * para acessar o método de exibir o nome. Repete para o próximo.
        */
        for(Aluno tmp : lista_alunos){
            System.out.println(tmp.getNome());
        }


        //2. Set e Maps --------------------------------------
        HashSet<String> conjunto = new HashSet<String>();

        //Map usa dois "type parameters" (chave e valor)
        HashMap<Integer,Aluno> map_alunos = new HashMap<Integer, Aluno>();
        map_alunos.put(1826277, a1);
        map_alunos.put(1940033, a2);

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o RA do aluno:");
        int RA = in.nextInt();

        //Se a chave (RA) existir, usa para salvar o objeto numa
        // variável e acessar o nome do aluno associado.
        if(map_alunos.containsKey(RA)){
            Aluno tmp = map_alunos.get(RA);
            System.out.println("Aluno com esse RA: "+tmp.getNome());
        }

        in.close();

        
    }
}
