package org.zenu.db.testes;

import org.zenu.db.Usuario;
import org.zenu.db.UsuarioDAO_mssql;

public class TesteUpdate {
    public static void main(String[] args) {
        //Recuperar um usuário
        UsuarioDAO_mssql dao = new UsuarioDAO_mssql();
        Usuario nv_user = dao.buscarPorID(4);

        //Mostre os valores do registro
        System.out.println("---( Nome, Data, Valor )---");
        System.out.println( nv_user.toString() );

        //Modificar os atributos
        nv_user.setNome("José Joestar");
        nv_user.setValor(1234567890);
        
        System.out.println("---( Nome, Data, Valor )---");
        System.out.println( nv_user.toString() );

        //Atualizar o registro
        dao.atualizar(nv_user); //Fiz tudo certo, mas por algum motivo não atualiza o SQL..

        System.out.println("Registro atualizado?");

    }
}
