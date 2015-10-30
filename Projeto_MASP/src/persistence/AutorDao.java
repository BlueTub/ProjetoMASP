package persistence;

import java.sql.SQLException;
import java.util.List;
import entity.Autor;

/**
 * 
 * @author Hury
 *
 */

public interface AutorDao {

	
	/**
	 * 
	 * @param a
	 * @throws SQLException
	 */
	void insereAutor(Autor a) throws SQLException;

	/**
	 * 
	 * @param a
	 * @throws SQLException
	 */
	void atualizaAutor(Autor a) throws SQLException;

	/**
	 * 
	 * @param a
	 * @throws SQLException
	 */
	void excluiAutor(Autor a) throws SQLException;

	/**
	 * 
	 * @param nome
	 * @return
	 * @throws SQLException
	 */
	List<Autor> pesquisaAutor(String nome) throws SQLException;

}
