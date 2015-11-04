package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import connection.ConnectionImpl;
import connection.GenericConnection;
import entity.Autor;

/**
 * 
 * @author Hury
 *
 */

public class AutorDaoImpl implements AutorDao {
	
	private Connection c;
	
	public AutorDaoImpl() {
		GenericConnection gc = new ConnectionImpl();
		c = gc.getConnection();
	}

	@Override
	public void insereAutor(Autor a) throws SQLException {
		String query = "INSERT INTO autor (?,?,?,?)";
		
		try {
			PreparedStatement ps = c.prepareStatement(query);
			ps.setString(1, a.getNomeAutor());
			ps.setString(2,a.getNacionalidade());
			ps.setString(3, a.getDescricao());
			ps.setString(4, a.getAreaAtividade());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void atualizaAutor(Autor a) throws SQLException {
		String query = "update autor set nome = ?, nacionalidade = ?,descricao = ? where codAutor = ?";
		try {
			PreparedStatement ps = c.prepareStatement(query);
			ps.setString(1, a.getNomeAutor());
;
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

	@Override
	public void excluiAutor(Autor a) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Autor> pesquisaAutor(String nome) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
