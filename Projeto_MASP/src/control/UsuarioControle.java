package control;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import boundary.TelaPrincipal;
import entity.Usuario;
import persistence.IUsuario;
import persistence.UsuarioImpl;

public class UsuarioControle {
	
	public void validaLogin(Usuario u){
		IUsuario iu = new UsuarioImpl();
		Usuario usu;
		try {
			usu = iu.validaLogin(u);
			if (usu == null) {
				JOptionPane.showMessageDialog(null, "Usuario n�o encontrado, \n ou n�o existe!");
			}else{
				TelaPrincipal tp = new TelaPrincipal();
				tp.main(null);
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(),
					"ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}

}
