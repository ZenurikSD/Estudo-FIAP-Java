package org.zenu.db.dao_interfaces;

import java.util.List;
import org.zenu.db.Usuario;

/** Interface que define a implementação do Data Access Object com métodos para manipulação da tabela*/
public interface UsuarioDAO {
    //Atributo de conexao

    /** Cadastra um novo usuário na tabela
     * @param usuario Traga um Objeto usuário com os atributos para cadastro.
     */
    void cadastrar(Usuario user);

    /** Lista de todos os registros da tabela
     * @return {@code List} de objetos {@link Usuario}
     */
    List<Usuario> listar();

    /** Remove um registro da tabela
     * @param codigo O código (ID) do usuário a remover
     */
    void remover(int id);

    /** Busca um registro na tabela pela ID
     * @return Usuário (registro) do código indicado
     */
    Usuario buscarPorID(int id);

    /** Atualiza um registro da tabela
     * @param user O usuário (registro retornado do {@link buscarPorID}
     * que você deseja atualizar.
    */
    void atualizar(Usuario user);
}
