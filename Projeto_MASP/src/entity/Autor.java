package entity;

import java.util.Date;

public class Autor {

	private long codigoAutor;
	private String nomeAutor;
	private Date  nascimento;
	private String nacionalidade;
	private Date dataMorte;
	private String movimento;
	private int periodAtividade;
	private String areaAtividade;
	private String descricao;
	
	
	
	public long getCodigoAutor() {
		return codigoAutor;
	}
	public void setCodigoAutor(long codigoAutor) {
		this.codigoAutor = codigoAutor;
	}
	public String getNomeAutor() {
		return nomeAutor;
	}
	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public Date getDataMorte() {
		return dataMorte;
	}
	public void setDataMorte(Date dataMorte) {
		this.dataMorte = dataMorte;
	}
	public String getMovimento() {
		return movimento;
	}
	public void setMovimento(String movimento) {
		this.movimento = movimento;
	}
	public int getPeriodAtividade() {
		return periodAtividade;
	}
	public void setPeriodAtividade(int periodAtividade) {
		this.periodAtividade = periodAtividade;
	}
	public String getAreaAtividade() {
		return areaAtividade;
	}
	public void setAreaAtividade(String areaAtividade) {
		this.areaAtividade = areaAtividade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
