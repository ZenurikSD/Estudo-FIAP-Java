package org.zenu;

/** Vetores de objetos, for-each e matrizes */
public class Vetores2 {
    public static void main(String[] args) {
        
        Aluno[] grupo = new Aluno[4];           //Vetor de objetos da classe Aluno

        Aluno estudante = new Aluno();          //Instância individual da classe
        estudante.setNome("Zenurik");
        grupo[0] = estudante;                   //Posição 0 recebe o objeto 

        //Adiciona um objeto com atributo definido em cada posição do array
        for(int i=0; i<grupo.length; i++){
            estudante.setNome("Zenu");
            grupo[i] = estudante;
        }
        
        //For-each
        // Leia-se: For (cada X em Y)
        for(Aluno a : grupo){
            System.out.println(a.getNome()); 
            //Exibe o atributo de nome de cada objeto armazenado no vetor 'grupo[]'
        }
    }
}
