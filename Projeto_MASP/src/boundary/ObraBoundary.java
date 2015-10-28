package boundary;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JFormattedTextField;
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;

import boundary.custom.JButtonCustom;
import boundary.custom.JComboBoxCustom;
import boundary.custom.JLabelCustom;
import boundary.custom.JPanelCustom;
import boundary.custom.JTextFieldCustom;
import control.ObraControl;
import entity.Obra;

public class ObraBoundary extends JPanelCustom{

	private JTextFieldCustom txtId;
	private JButtonCustom btnPesquisarObra;
	private JTextFieldCustom txtTitulo;
	private JComboBoxCustom cmbCategoria;
	private JComboBoxCustom cmbTipo;
	private JComboBoxCustom cmbTecnica;
	private JFormattedTextField txtData;
	private JPanelCustom painelDimensoes;
	private JTextFieldCustom txtLargura;
	private JTextFieldCustom txtAltura;
	private JLabelCustom lblProfundidade;
	private JTextFieldCustom txtProfundidade;
	private JTextFieldCustom txtDados;
	private JTextFieldCustom txtAutor;
	private JButtonCustom btnPesquisarAutor;
	private JTextFieldCustom txtValor;
	private JTextFieldCustom txtDoador;
	private JPanelCustom painelBotoes;
	private JButtonCustom btnSalvar;
	private JButtonCustom btnAlterar;

	private ObraControl obraControl;
	
	@SuppressWarnings("unchecked")
	public ObraBoundary(){
		obraControl = new ObraControl();
		
		JLabelCustom lblId = new JLabelCustom("Número de identificação:");
		this.add(lblId);
		lblId.setBounds(40, 20, 245, 35);

		txtId = new JTextFieldCustom( );
		this.add(txtId);
		txtId.setBounds(295, 20, 140, 35);

		btnPesquisarObra = new JButtonCustom("Pesquisar");
		this.add(btnPesquisarObra);
		btnPesquisarObra.setBounds(445, 20, 140, 35);

		JLabelCustom lblTitulo = new JLabelCustom("Título:");
		this.add(lblTitulo);
		lblTitulo.setBounds(40, 80, 100, 35);

		txtTitulo = new JTextFieldCustom();
		this.add(txtTitulo);
		txtTitulo.setBounds(140, 80, 295, 35);

		JLabelCustom lblCategoria = new JLabelCustom("Categoria:");
		this.add(lblCategoria);
		lblCategoria.setBounds(40, 140, 100, 35);

		cmbCategoria = new JComboBoxCustom();
		this.add(cmbCategoria);
		cmbCategoria.setBounds(150, 140, 220, 35);

		JLabelCustom lblTipo = new JLabelCustom("Tipo obra:");
		this.add(lblTipo);
		lblTipo.setBounds(500, 140, 150, 35);

		cmbTipo = new JComboBoxCustom();
		this.add(cmbTipo);
		cmbTipo.setBounds(620, 140, 220, 35);

		JLabelCustom lblTecnica = new JLabelCustom("Técnica:");
		this.add(lblTecnica);
		lblTecnica.setBounds(40, 200, 100, 35);

		cmbTecnica = new JComboBoxCustom();
		this.add(cmbTecnica);
		cmbTecnica.setBounds(150, 200, 190, 35);

		try {
			JLabelCustom lblDataObra = new JLabelCustom("Data da obra:");
			this.add(lblDataObra);
			lblDataObra.setBounds(500, 200, 140, 35);

			txtData = new JFormattedTextField(new MaskFormatter("##/##/####"));
			this.add(txtData);
			txtData.setBounds(650, 200, 140, 35);
			txtData.setFont(new Font("Arial", 0, 19));
			txtData.setBorder(new LineBorder(new Color(0, 0, 0)));
		} catch (ParseException e) {}

		painelDimensoes = new JPanelCustom();
		this.add(painelDimensoes);
		painelDimensoes.setBounds(30, 260, 860, 80);
		painelDimensoes.setBackground(new Color(240, 240, 240));

		JLabelCustom lblDimensoes = new JLabelCustom("Dimensões");
		painelDimensoes.add(lblDimensoes);
		lblDimensoes.setBounds(10, 0, 140, 35);
		lblDimensoes.setFont(new Font("Arial", 2, 18));
		lblDimensoes.setForeground(new Color(140, 140, 140));	

		JLabelCustom lblLargura = new JLabelCustom("Largura:");
		painelDimensoes.add(lblLargura);
		lblLargura.setBounds(150, 10, 100, 35);

		txtLargura = new JTextFieldCustom();
		painelDimensoes.add(txtLargura);
		txtLargura.setBounds(260, 10, 50, 35);

		JLabelCustom lblAltura = new JLabelCustom("Altura:");
		painelDimensoes.add(lblAltura);
		lblAltura.setBounds(350, 10, 100, 35);

		txtAltura = new JTextFieldCustom();
		painelDimensoes.add(txtAltura);
		txtAltura.setBounds(460, 10, 50, 35);

		lblProfundidade = new JLabelCustom("Profundidade:");
		painelDimensoes.add(lblProfundidade);
		lblProfundidade.setBounds(550, 0, 150, 50);

		txtProfundidade = new JTextFieldCustom();
		painelDimensoes.add(txtProfundidade);
		txtProfundidade.setBounds(710, 10, 50, 35);

		JLabelCustom lblDados = new JLabelCustom("Dados biográficos:");
		this.add(lblDados);
		lblDados.setBounds(40, 350, 230, 35);

		txtDados = new JTextFieldCustom();
		this.add(txtDados);
		txtDados.setBounds(240, 350, 500, 35);

		JLabelCustom lblAutor = new JLabelCustom("Autor:");
		this.add(lblAutor);
		lblAutor.setBounds(40, 410, 100, 35);

		txtAutor = new JTextFieldCustom();
		this.add(txtAutor);
		txtAutor.setBounds(110, 410, 200, 35);

		btnPesquisarAutor = new JButtonCustom("Pesquisar");
		this.add(btnPesquisarAutor);
		btnPesquisarAutor.setBounds(320, 410, 130, 35);

		JLabelCustom lblValor = new JLabelCustom("Valor:");
		this.add(lblValor);
		lblValor.setBounds(40, 470, 60, 35);

		txtValor = new JTextFieldCustom();
		this.add(txtValor);
		txtValor.setBounds(110, 470, 200, 35);

		JLabelCustom lblDoador = new JLabelCustom("Doador:");
		this.add(lblDoador);
		lblDoador.setBounds(400, 470, 79, 35);

		txtDoador = new JTextFieldCustom();
		this.add(txtDoador);
		txtDoador.setBounds(510, 470, 200, 35);

		painelBotoes = new JPanelCustom();
		this.add(painelBotoes);
		painelBotoes.setBounds(20, 530, 880, 60);
		painelBotoes.setBackground(painelDimensoes.getBackground());

		btnSalvar = new JButtonCustom("Salvar");
		painelBotoes.add(btnSalvar);
		btnSalvar.setBounds(600, 10, 130, 35);

		btnAlterar = new JButtonCustom("Alterar");
		painelBotoes.add(btnAlterar);
		btnAlterar.setBounds(200, 10, 130, 35);


		/*
		 * Preenchimento das caixas de seleção 
		 */

		ArrayList<String> categorias = new ArrayList<String>();
		categorias.add("Arte Brasileira");
		categorias.add("Arte Francesa");
		categorias.add("Arte Italiana");
		categorias.add("Arte das Américas");
		categorias.add("Arte da Península libérica");
		categorias.add("Arte Europa Central");
		categorias.add("Arte Setentrional");
		categorias.add("Arte Oriental");

		for (String c : categorias)
			cmbCategoria.addItem( c);

		////Alterar
		ArrayList<Object> tecnicas = new ArrayList<Object>();
		tecnicas.add("1");
		tecnicas.add("2");
		tecnicas.add("3");

		for (Object num : tecnicas)
			cmbTecnica.addItem("Técnica " + num);
		////

		ArrayList<String> tipos = new ArrayList<String>();
		tipos.add("Pintura");
		tipos.add("Escultura");
		tipos.add("Gravura");
		tipos.add("Desenhos");
		tipos.add("Fotografia");
		tipos.add("Maiólicas");
		tipos.add("Arqueologia");
		tipos.add("Arte Africana");
		tipos.add("Arte Asiática");
		tipos.add("Kitsch");
		tipos.add("Vestuário");
		tipos.add("Outros");

		for (String t : tipos)
			cmbTipo.addItem(t);


		//

		txtProfundidade.setVisible(false);
		lblProfundidade.setVisible(false);

		ActionListener al = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				if (cmd.equals("comboBoxChanged")){
					alterarTxtProfundidade();
				}
				if (cmd.equals(btnSalvar.getText())){
					Obra obra = new Obra();
					obra = pegarDadosFrame();
					obraControl.salvar(obra);
				}
				if (cmd.equals(btnAlterar.getText())){
					Obra obra = new Obra();
					obra = pegarDadosFrame();
					obraControl.alterar(obra);
				}
				
			}
		};		//Fim action listener


		cmbTipo.addActionListener(al);
		
		btnSalvar.addActionListener(al);
		btnAlterar.addActionListener(al);
	}


	/*
	 * Procedure que altera a visibilidade do campo de texto profundidade.
	 * O campo só deve ser visível quando a opção "Escultura" for selecionada.
	 */

	public void alterarTxtProfundidade(){
		if (cmbTipo.getSelectedItem().equals("Escultura")){
			txtProfundidade.setVisible(true);
			lblProfundidade.setVisible(true);
		}
		else{
			txtProfundidade.setVisible(false);
			lblProfundidade.setVisible(false);
		}

	}

	/*
	 * Função que retorna um objeto obra com as informações
	 * digitadas pelo usuário
	 */
	public Obra pegarDadosFrame(){
		Obra obra = new Obra();

		double valor = 0;
		String titulo = "";
		String tipo = "";
		String tecnica = "";
		double profundidade = 0;
		double largura = 0;
		String id = "";
		String doador = "";
		Date dataObra;
		String dadosBiograficos = "";
		String categoria = "";
		int codAutor = 0;
		double altura = 0;

		try{
			valor = Double.parseDouble(txtValor.getText());
		}catch (Exception e){
			System.out.println("Valor inválido.");
		}

		titulo = txtTitulo.getText();
		tipo = (String) cmbTipo.getSelectedItem();		
		tecnica = (String) cmbTecnica.getSelectedItem();

		if (txtProfundidade.isVisible()){
			try{
				profundidade = Double.parseDouble(txtProfundidade.getText());
			}catch (Exception e){
				System.out.println("Valor inválido. " + txtProfundidade.getName());
			}

		} 

		try{
			largura = Double.parseDouble(txtLargura.getText());
		}catch (Exception e){
			System.out.println("Valor inválido." + txtLargura.getName());
		}

		id = txtId.getText();
		doador = txtDoador.getText();

		dadosBiograficos = txtDados.getText();
		categoria = (String) cmbCategoria.getSelectedItem();

		try{
			codAutor = Integer.parseInt(txtAutor.getText());
		}catch (Exception e){
			System.out.println("Valor inválido." + txtAutor.getName());
		}

		try{
			altura = Double.parseDouble(txtAltura.getText());
		}catch (Exception e){
			System.out.println("Valor inválido." + txtAltura.getName());
		}

		try{
			dataObra = pegaData();
		}catch(Exception e){
			java.util.Date data = new java.util.Date();
			dataObra = new Date(data.getTime());
		}

		obra.setValor(valor);
		obra.setTitulo(titulo);
		obra.setTipo(tipo);
		obra.setTecnica(tecnica);
		obra.setProfundidade(profundidade);
		obra.setLargura(largura);
		obra.setId(id);
		obra.setDoador(doador);
		obra.setDataObra(dataObra);
		obra.setDadosBiograficos(dadosBiograficos);
		obra.setCategoria(categoria);;
		obra.setAutor(codAutor);
		obra.setAltura(altura);

		return obra;
	}

	/*
	 * Função que retorna a data digitada pelo usuário 
	 */
	public Date pegaData(){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		java.util.Date data = new java.util.Date();
		try {
			data = sdf.parse(txtData.getText());
		} catch (ParseException e) {
		}

		return new Date(data.getTime());
	}

}
