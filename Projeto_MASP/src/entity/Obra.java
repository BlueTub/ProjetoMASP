package entity;

import java.sql.Date;

public class Obra {

	private String id;
	
	private String titulo;
	
	private String categoria;
	
	private String tipo;
	
	private String tecnica;
	
	private Date dataObra;
	
	private double altura;
	
	private double largura;
	
	private double profundidade;
	
	private String dadosBiograficos;
	
	private int autor;
	
	private double valor;
	
	private String doador;

	public String getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getCategoria() {
		return categoria;
	}

	public String getTipo() {
		return tipo;
	}

	public String getTecnica() {
		return tecnica;
	}

	public Date getDataObra() {
		return dataObra;
	}

	public double getAltura() {
		return altura;
	}

	public double getLargura() {
		return largura;
	}

	public double getProfundidade() {
		return profundidade;
	}

	public String getDadosBiograficos() {
		return dadosBiograficos;
	}

	public int getAutor() {
		return autor;
	}

	public double getValor() {
		return valor;
	}

	public String getDoador() {
		return doador;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}

	public void setDataObra(Date dataObra) {
		this.dataObra = dataObra;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public void setProfundidade(double profundidade) {
		this.profundidade = profundidade;
	}

	public void setDadosBiograficos(String dadosBiograficos) {
		this.dadosBiograficos = dadosBiograficos;
	}

	public void setAutor(int autor) {
		this.autor = autor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setDoador(String doador) {
		this.doador = doador;
	}
	
	
}
