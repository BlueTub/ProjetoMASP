package control;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import entity.Visitante;
import persistence.IVisitante;
import persistence.VisitanteImpl;

public class VisitanteControl {
	
	Visitante v = new Visitante();

	public void insereVisitante() {
		IVisitante iv = new VisitanteImpl();
		try {
			iv.insereVisitante(v);
			JOptionPane.showMessageDialog(null, 
					"Cadastrado com Sucesso","Sucesso",
					JOptionPane.INFORMATION_MESSAGE);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(),
					"ERRO", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
	}
	
	public void consultaVisitantePeloNome(String nome) {
		IVisitante iv = new VisitanteImpl();
		Visitante v = new Visitante();
		try {
			v = iv.consultaVisitante(nome);
			if (v == null) {
				JOptionPane.showMessageDialog(null, "Nome não encontrado!");
			} else {
				v.getDtNasc();
				v.getSexo();
				v.getNacionalidade();
				v.getNaturalidade();
				v.getNivelAcademico();
				v.getRg();
				v.getCpf();
				v.getPassaporte();
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(),
					"ERRO", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
	}
	
	public void chamaValidaRG(String rg) {
		Visitante v = new Visitante();
		v.validaRG(rg);
	}
	
	public void chamaValidaCPF(String cpf){
		Visitante v = new Visitante();
		v.validaCPF(cpf);
	}
}
