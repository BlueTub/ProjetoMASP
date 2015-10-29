package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.ConnectionImpl;
import connection.GenericConnection;
import entity.Visitante;

public class VisitanteImpl implements IVisitante{
	
	Connection c;
	
	public VisitanteImpl() {
		GenericConnection gc = new ConnectionImpl();
		c = gc.getConnection();
	}

	@Override
	public void insereVisitante(Visitante v) throws SQLException {
		System.out.println("entrou no Impl insereVisitante()");
		String sql = "INSERT INTO visitante VALUES (?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setString(1, v.getNome());
		ps.setString(2, v.getDtNasc());
		ps.setString(3, v.getSexo());
		ps.setString(4, v.getNacionalidade());
		ps.setString(5, v.getNaturalidade());
		ps.setString(6, v.getNivelAcademico());
		ps.setString(7, v.getRg());
		ps.setString(8, v.getCpf());
		ps.setString(9, v.getPassaporte());
		ps.execute();
		ps.close();
	}

	@Override
	public Visitante consultaVisitante(String nome) throws SQLException {
		String sql = "select CONVERT(char(10),dtNasc , 103) as dtNasc, "
				+ "sexo, nacionalidade, naturalidade, nivelAcademico, "
				+ "rg, cpf, passaporte "
				+ "from visitante "
				+ "where nome = (?)";
		PreparedStatement ps = c.prepareStatement(sql);
		Visitante v = new Visitante();
		ps.setString(1, nome);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			v.setDtNasc(rs.getString("dtNasc"));
			v.setSexo(rs.getString("sexo"));
			v.setNacionalidade(rs.getString("nacionalidade"));
			v.setNaturalidade(rs.getString("naturalidade"));
			v.setNivelAcademico(rs.getString("nivelAcademico"));
			v.setRg(rs.getString("rg"));
			v.setCpf(rs.getString("cpf"));
			v.setPassaporte(rs.getString("passaporte"));
		} else {
			v = null;
		}
		return v;
	}

}
