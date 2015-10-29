package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.ConnectionImpl;
import connection.GenericConnection;
import entity.Usuario;

public class UsuarioImpl implements IUsuario{
	
	Connection c;
	
	public UsuarioImpl() {
		GenericConnection gc = new ConnectionImpl();
		c = gc.getConnection();
	}
	

	@Override
	public Usuario validaLogin(Usuario u) throws SQLException {
		String sql = "select login, senha from usuario where login = (?) and senha = (?)";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setString(1, u.getLogin());
		ps.setString(2, u.getSenha());
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			u.setLogin(rs.getString("login"));
			u.setSenha(rs.getString("senha"));
		} else {
			u = null;
		}
		return u;
	}

}
