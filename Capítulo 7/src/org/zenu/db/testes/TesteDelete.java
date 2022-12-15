package org.zenu.db.testes;

import org.zenu.db.UsuarioDAO;

public class TesteDelete {
    public static void main(String[] args) {

        UsuarioDAO dao = new UsuarioDAO();
        dao.remover(5);

    }    
}
