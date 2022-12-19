package org.zenu.db.factory;

import org.zenu.db.UsuarioDAO_mssql;
import org.zenu.db.dao_interfaces.UsuarioDAO;

/** Fábrica de DAOs para o SQL Server.
 * Extende a classe abstrata DAOFactory e implementa seus métodos. */
public class MSsqlDAOFactory extends DAOFactory{

    /** Retorna uma instância do UsuárioDAO para o SQLServer
     * @see UsuarioDAO_mssql
    */
    @Override
    public UsuarioDAO getUserDAO(){
        return new UsuarioDAO_mssql();
    }

}
