package org.zenu.db.testes;

import org.zenu.db.Usuario;
import org.zenu.db.UsuarioDAO_mssql;
import java.util.List;

/**Listar todos os registros na tabela de usuários */
public class TesteLista {
    public static void main(String[] args) {
        
        UsuarioDAO_mssql dao = new UsuarioDAO_mssql();
        List<Usuario> lista = dao.listar(); //Se já retorna uma lista, bota direto aqui!

        System.out.println("\n--------[ID, Nome, Data, Valor]----------");

        for(Usuario user : lista){
            System.out.println(user.toString());
            //MUITO MAIS SIMPLES PQP
        }
    }
}
