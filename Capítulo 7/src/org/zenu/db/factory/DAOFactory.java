package org.zenu.db.factory;

import org.zenu.db.dao_interfaces.UsuarioDAO;

/** Abstract Factory para criação de DAOs dos diferentes servidores
 * @see 
*/
public abstract class DAOFactory {

    //Constantes que definem os servidores suportados
    public static final int SQLSERVER = 1;
    //public static final int ORACLE = 2; //não implementado

    /** Atributo para armazenar a instância da Factory do SQL Server*/
    public static DAOFactory mssqlDAOFactory;

    /** Instancia uma DAOFactory específica de um servidor
     * @param servidor A constante do servidor escolhido
     * @return O DAO Factory do servidor
    */
    public static DAOFactory getDAOFactory(int servidor){

        //Troca de implementação e instancia uma Factory se não existir
        switch(servidor){
        case SQLSERVER:
            if(mssqlDAOFactory==null){
                mssqlDAOFactory = new MSsqlDAOFactory();
            }
            return mssqlDAOFactory;

        default:
            return null;
        }
    }
    
    /** Método que retorna a instância da implementação do UsuarioDAO de acordo com o servidor */
    public abstract UsuarioDAO getUserDAO();
}
