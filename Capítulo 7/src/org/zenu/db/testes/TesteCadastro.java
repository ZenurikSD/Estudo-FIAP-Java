package org.zenu.db.testes;

import java.util.Calendar;
import org.zenu.db.Usuario;
import org.zenu.db.UsuarioDAO;

public class TesteCadastro {
    public static void main(String[] args) {
        //Instância do DAO
        UsuarioDAO dao = new UsuarioDAO();

        //Instância de um usuário
        Usuario user = new Usuario();
        user.setNome("Shardo");
        user.setData(Calendar.getInstance());
        user.setValor(8001);

        dao.listar();

        //Tente cadastrar o objeto no banco
        dao.cadastrar(user);

        System.out.println("\nUsuário "+user.getNome()+" cadastrado com sucesso");
    }
}
