package org.zenu.db.factory;

import org.zenu.db.dao_interfaces.UsuarioDAO;

/** Abstract Factory para criação de DAOs dos diferentes servidores
 * @see MSsqlDAOFactory Implementação para o SQLServer
*/
public abstract class DAOFactory {

    //Constantes que definem os servidores suportados
    public static final int SQLSERVER = 1;
    //public static final int ORACLE = 2; //não implementado

    /** Atributo para armazenar a instância da Factory do SQL Server*/
    public static DAOFactory mssql_daofac;

    /** Instancia uma DAOFactory específica de um servidor
     * @param servidor A constante do servidor escolhido
     * @return O DAO Factory do servidor
    */
    public static DAOFactory getDAOFactory(int servidor){

        switch(servidor){
        case SQLSERVER:
            if(mssql_daofac==null){
                mssql_daofac = new MSsqlDAOFactory();
            }
            return mssql_daofac;

        default:
            return null;
        }
    }
    
    /** Retorna a instância do UsuarioDAO de acordo com o servidor */
    public abstract UsuarioDAO getUserDAO();
}
