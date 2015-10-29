package boundary;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import entity.Autor;

public class FrmAutor extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtDataNasc;
	private JTextField txtNacionalidade;
	private JTextField txtAreaAtividade;
	private JTextField txtMorte;
	private JComboBox<String> cbMovimento; 
	private JTextPane txtpaneDescricao; 
	private JRadioButton rdbtnFalecido;
	private JLabel lblDataDaMorte;

	java.util.Date dataNasc=new java.util.Date();
	java.util.Date dataMort=new java.util.Date();
	SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmAutor frame = new FrmAutor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmAutor() {
		setTitle("Cadastrar Autor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 698, 452);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome :");
		lblNome.setBounds(74, 66, 46, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(130, 63, 377, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblDataNasc = new JLabel("Data de Nasc.:");
		lblDataNasc.setBounds(38, 97, 82, 14);
		contentPane.add(lblDataNasc);
		
		txtDataNasc = new JTextField();
		txtDataNasc.setBounds(130, 94, 124, 20);
		contentPane.add(txtDataNasc);
		txtDataNasc.setColumns(10);
		
		JLabel lblNacionalidade = new JLabel("Nacionalidade :");
		lblNacionalidade.setBounds(38, 129, 82, 14);
		contentPane.add(lblNacionalidade);
		
		txtNacionalidade = new JTextField();
		txtNacionalidade.setBounds(130, 126, 143, 20);
		contentPane.add(txtNacionalidade);
		txtNacionalidade.setColumns(10);
		
		JLabel lblMovimento = new JLabel("Movimento :");
		lblMovimento.setBounds(49, 210, 71, 14);
		contentPane.add(lblMovimento);
		
	    cbMovimento = new JComboBox<String>();
		cbMovimento.setBounds(130, 207, 179, 20);
		contentPane.add(cbMovimento);
		
		JLabel lblAreaAtividades = new JLabel("Area (atividade) :");
		lblAreaAtividades.setBounds(23, 247, 97, 14);
		contentPane.add(lblAreaAtividades);
		
		txtAreaAtividade = new JTextField();
		txtAreaAtividade.setBounds(130, 244, 179, 20);
		contentPane.add(txtAreaAtividade);
		txtAreaAtividade.setColumns(10);
		
		JLabel lblDescricao = new JLabel("Descri\u00E7\u00E3o :");
		lblDescricao.setBounds(49, 288, 71, 14);
		contentPane.add(lblDescricao);
		
		txtpaneDescricao = new JTextPane();
		txtpaneDescricao.setBounds(130, 288, 391, 49);
		contentPane.add(txtpaneDescricao);
		
		lblDataDaMorte = new JLabel("Data da morte :");
		lblDataDaMorte.setEnabled(false);
		lblDataDaMorte.setBounds(388, 96, 76, 17);
		contentPane.add(lblDataDaMorte);
		
		rdbtnFalecido = new JRadioButton("Falecido");
		rdbtnFalecido.setBounds(300, 93, 82, 23);
		contentPane.add(rdbtnFalecido);
		
	
		
		txtMorte = new JTextField();
		txtMorte.setEnabled(true);
		txtMorte.setBounds(474, 94, 86, 20);
		contentPane.add(txtMorte);
		txtMorte.setColumns(10);
		
		//
		txtMorte.setVisible(false);
		lblDataDaMorte.setVisible(false);
		
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCadastrar.setBounds(566, 362, 106, 41);
		contentPane.add(btnCadastrar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(10, 371, 71, 32);
		contentPane.add(btnVoltar);
		
		
		
		/**
		 * ArrayList com o preenchimento do campo movimento.
		 */
		ArrayList<String> movimento = new ArrayList<String>();
		movimento.add("Selecione o Movimento");
		movimento.add("Art Déco");
		movimento.add("Arte Naif");
		movimento.add("Arte Povera");
		movimento.add("Barroco");
		movimento.add("Costumbismo");
		movimento.add("Dadaísmo");
		movimento.add("Dieselpunk");
		movimento.add("Expressionismo");
		movimento.add("Fauvismo");
		movimento.add("Futurismo");
		movimento.add("Humanismo");
		movimento.add("Imagismo");
		movimento.add("Impressionismo");
		movimento.add("Movimento Armorial");
		movimento.add("Neoconcretismo");
		movimento.add("Neoplasticismo");
		movimento.add("Nova Objetividade");
		movimento.add("Orfismo");
		movimento.add("Pop-Art");
		movimento.add("Pós-Modernismo");
		movimento.add("Primitivismo");
		movimento.add("Purismo");
		movimento.add("Raionismo");
		movimento.add("Realismo");
		movimento.add("Renascimento");
		movimento.add("Romantismo");
		movimento.add("Simbolismo");
		movimento.add("Suprematismo");
		movimento.add("Surrealismo");
		movimento.add("Tenebrismo");
		movimento.add("Tropicália");
		movimento.add("Universo Gótico");
		movimento.add("Vorticismo");
		
		for (String m : movimento)
			cbMovimento.addItem(m);

	}
	
	public Date dataNasc(){
		
		try{
			dataNasc= sdf.parse(txtDataNasc.getText());
		}catch(ParseException e){
			System.out.println("data Incorreta");
		}	
		return new Date(dataNasc.getTime());
	}
	
	public Date dataMort(){
		try {
			dataMort=sdf.parse(txtMorte.getText());
		} catch (ParseException e) {
			System.out.println("data Incorreta");
		}
		return new  Date (dataMort.getTime());
	}
	
	
	public void acionaFalecimento(){
		if(rdbtnFalecido.isSelected()){
			
			txtMorte.setVisible(true);
			lblDataDaMorte.setVisible(true);
		}else{
			txtMorte.setVisible(false);
			lblDataDaMorte.setVisible(false);
		}
	}
	
	public Autor autorFrame(){
		Autor autor=new Autor();
		
		
		String nome="";
		Date  dataNasc;
		Date dataMort;
		String nacionalidade="";
		String movimento="";
		String areaAtiv="";
		String descricao="";
		
		nome= txtNome.getText();
		dataNasc=dataNasc();
		dataMort=dataMort();
		nacionalidade=txtNacionalidade.getText();
		movimento=(String) cbMovimento.getSelectedItem();
		areaAtiv=txtAreaAtividade.getText();
		descricao=txtpaneDescricao.getText();
		
		autor.setNomeAutor(nome);
		autor.setNascimento(dataNasc);
		autor.setDataMorte(dataMort);
		autor.setNacionalidade(nacionalidade);
		autor.setMovimento(movimento);
		autor.setAreaAtividade(areaAtiv);
		autor.setDescricao(descricao);
		
		return autor;
		
	}
	
	
	
	
}
