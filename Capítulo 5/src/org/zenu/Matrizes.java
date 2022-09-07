package org.zenu;

public class Matrizes {
    public static void main(String[] args) {
    
        int grade2[][] = new int[2][2];   //Declaração vazia
        grade2[0][0] = 2;                 //Atribuição vem depois

        int grade3[][] = {{0,1,0},        //Declaração direta
                          {1,0,1},
                          {0,1,0}};     

        //Percorrendo uma matriz  (Salve visualg)
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(grade3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
