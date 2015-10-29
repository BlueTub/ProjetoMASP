package entity;

public class Visitante {
	
	private String nome;
	private String dtNasc;
	private String sexo;
	private String nacionalidade;
	private String naturalidade;
	private String nivelAcademico;
	private String rg;
	private String cpf;
	private String passaporte;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDtNasc() {
		return dtNasc;
	}
	public void setDtNasc(String string) {
		this.dtNasc = string;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	public String getNivelAcademico() {
		return nivelAcademico;
	}
	public void setNivelAcademico(String nivelAcademico) {
		this.nivelAcademico = nivelAcademico;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getPassaporte() {
		return passaporte;
	}
	public void setPassaporte(String passaporte) {
		this.passaporte = passaporte;
	}
	
	
	public void validaRG (String rg) {
//		metodo que valida o cpf do visitante
	}
	
	public void validaCPF (String cpf) {
//		metodo que valida o cpf do visitante
	}
}
