package org.zenu.db.testes;

import org.zenu.db.factory.*;
import java.util.List;
import org.zenu.db.Usuario;
import org.zenu.db.dao_interfaces.UsuarioDAO;


/** Usando a Fábrica de DAOs genérica, cria uma instância da fábrica do SQLServer. Com ela, fabrica o objeto de UsuárioDAO adequado.
 * 
 * <p>A vantagem disso é que caso eu troque de servidor (Oracle por ex.), basta mudar a constante usada no getDAOFactory() e todo o resto aqui continuaria funcionando perfeitamente. (Contando que eu tivesse implementado a factory e o DAO para o Oracle funcionar)
 * </p>
*/
public class TesteDAOFactory {
    public static void main(String[] args) {
        //Instancia uma Fábrica DAO SQLServer
        DAOFactory dao_mssql = DAOFactory.getDAOFactory(DAOFactory.SQLSERVER);

        //Fabrica uma nova instância do objeto de manipulação do Usuário para o SQLServer
        UsuarioDAO user = dao_mssql.getUserDAO();

        List<Usuario> lista = user.listar();

        for(Usuario u : lista){
            System.out.println(u.toString());
        }
    
    }
}
