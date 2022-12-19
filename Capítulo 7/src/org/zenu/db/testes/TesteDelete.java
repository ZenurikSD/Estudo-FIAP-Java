package org.zenu.db.testes;

import org.zenu.db.UsuarioDAO_mssql;

public class TesteDelete {
    public static void main(String[] args) {

        UsuarioDAO_mssql dao = new UsuarioDAO_mssql();
        dao.remover(5);

    }    
}
