package boundary;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class TelaUsuario implements ActionListener{

	private JFrame frmRegistraVisitante;
	private JTextField txtNome;
	private JTextField txtDataNasc;
	private JTextField txtNacionalidade;
	private JTextField txtNaturalidade;
	private JTextField txtDocumento;
	private JRadioButton rdbtnMasculino;
	private JRadioButton rdbtnFeminino;
	private JRadioButton rdbtnRg;
	private JRadioButton rdbtnCpf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaUsuario window = new TelaUsuario();
					window.frmRegistraVisitante.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaUsuario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "rawtypes", "deprecation" })
	private void initialize() {
		frmRegistraVisitante = new JFrame();
		frmRegistraVisitante.setTitle("Registra Visitante");
		frmRegistraVisitante.setBounds(100, 100, 664, 481);
		frmRegistraVisitante.setDefaultCloseOperation(JFrame.DEFAULT_CURSOR);
		frmRegistraVisitante.getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Nome :");
		lblNome.setBounds(30, 16, 46, 14);
		frmRegistraVisitante.getContentPane().add(lblNome);
		
		JLabel lblDataDeNasc = new JLabel("Data de Nasc.:");
		lblDataDeNasc.setBounds(30, 73, 102, 14);
		frmRegistraVisitante.getContentPane().add(lblDataDeNasc);
		
		JLabel lblGnero = new JLabel("Gênero: ");
		lblGnero.setBounds(340, 46, 58, 14);
		frmRegistraVisitante.getContentPane().add(lblGnero);
		
		JLabel lblNacionalidade = new JLabel("Nacionalidade: ");
		lblNacionalidade.setBounds(30, 117, 102, 14);
		frmRegistraVisitante.getContentPane().add(lblNacionalidade);
		
		JLabel lblNaturalidade = new JLabel("Naturalidade :");
		lblNaturalidade.setBounds(339, 117, 95, 14);
		frmRegistraVisitante.getContentPane().add(lblNaturalidade);
		
		JLabel lblTipoDeDocumento = new JLabel("Tipo de Documento :");
		lblTipoDeDocumento.setBounds(346, 161, 120, 14);
		frmRegistraVisitante.getContentPane().add(lblTipoDeDocumento);
		
		JLabel lblNvelAcadmico = new JLabel("N\u00EDvel Acad\u00EAmico :");
		lblNvelAcadmico.setBounds(30, 161, 102, 14);
		frmRegistraVisitante.getContentPane().add(lblNvelAcadmico);
		
		txtNome = new JTextField();
		txtNome.setBounds(86, 13, 256, 20);
		frmRegistraVisitante.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		txtDataNasc = new JTextField();
		txtDataNasc.setBounds(125, 70, 113, 20);
		frmRegistraVisitante.getContentPane().add(txtDataNasc);
		txtDataNasc.setColumns(10);
		
		txtNacionalidade = new JTextField();
		txtNacionalidade.setBounds(124, 114, 151, 20);
		frmRegistraVisitante.getContentPane().add(txtNacionalidade);
		txtNacionalidade.setColumns(10);
		
		txtNaturalidade = new JTextField();
		txtNaturalidade.setBounds(427, 114, 151, 20);
		frmRegistraVisitante.getContentPane().add(txtNaturalidade);
		txtNaturalidade.setColumns(10);
		
		txtDocumento = new JTextField();
		txtDocumento.setBounds(495, 183, 143, 20);
		frmRegistraVisitante.getContentPane().add(txtDocumento);
		txtDocumento.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(140, 158, 173, 20);
		frmRegistraVisitante.getContentPane().add(comboBox);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnMasculino);
		bg.add(rdbtnFeminino);
		
		rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setBounds(340, 67, 103, 23);
		frmRegistraVisitante.getContentPane().add(rdbtnMasculino);
		
		rdbtnFeminino = new JRadioButton("Feminino");
		rdbtnFeminino.setBounds(445, 67, 88, 23);
		frmRegistraVisitante.getContentPane().add(rdbtnFeminino);
		
		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(rdbtnRg);
		bg1.add(rdbtnCpf);
		
		rdbtnRg = new JRadioButton("RG");
		rdbtnRg.setBounds(344, 182, 46, 23);
		frmRegistraVisitante.getContentPane().add(rdbtnRg);
		
		rdbtnCpf = new JRadioButton("CPF");
		rdbtnCpf.setBounds(418, 182, 55, 23);
		frmRegistraVisitante.getContentPane().add(rdbtnCpf);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Meio de Locomo\u00E7\u00E3o at\u00E9 o museu", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "Meio de locomo\u00E7\u00E3o", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(30, 235, 431, 127);
		frmRegistraVisitante.getContentPane().add(panel);
		panel.setLayout(null);
		
		JCheckBox chckbxAP = new JCheckBox("A pé");
		chckbxAP.setBounds(36, 33, 97, 23);
		panel.add(chckbxAP);
		
		JCheckBox chckbxnibus = new JCheckBox("Ônibus");
		chckbxnibus.setBounds(164, 33, 85, 23);
		panel.add(chckbxnibus);
		
		JCheckBox chckbxMetrtrem = new JCheckBox("Metrô/Trem");
		chckbxMetrtrem.setBounds(287, 33, 97, 23);
		panel.add(chckbxMetrtrem);
		
		JCheckBox chckbxTransporteParticular = new JCheckBox("Transporte Particular");
		chckbxTransporteParticular.setBounds(36, 83, 149, 23);
		panel.add(chckbxTransporteParticular);
		
		JCheckBox chckbxOutros = new JCheckBox("Outros");
		chckbxOutros.setBounds(216, 83, 97, 23);
		panel.add(chckbxOutros);
		
		JButton btnPesquisa = new JButton("");
		btnPesquisa.setIcon(new ImageIcon(TelaUsuario.class.getResource("/br/eng/icon/img-pesquisa.png")));
		btnPesquisa.setBounds(352, 12, 46, 23);
		frmRegistraVisitante.getContentPane().add(btnPesquisa);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setIcon(new ImageIcon(TelaUsuario.class.getResource("/br/eng/icon/img-voltar.png")));
		btnVoltar.setBounds(10, 394, 108, 38);
		frmRegistraVisitante.getContentPane().add(btnVoltar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setIcon(new ImageIcon(TelaUsuario.class.getResource("/br/eng/icon/img-salvar.png")));
		btnSalvar.setBounds(536, 394, 102, 38);
		frmRegistraVisitante.getContentPane().add(btnSalvar);
		
		btnPesquisa.addActionListener(this);
		btnSalvar.addActionListener(this);
		btnVoltar.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if ("".equals(cmd)) {
			System.out.println("btnPesquisa Clicado");
		}
		if ("Voltar".equals(cmd)) {
			frmRegistraVisitante.dispose();
		}
		if ("Salvar".equals(cmd)) {
			System.out.println("btnSalvar Clicado");
		}
	}
	
	public void validaDocumentacao() {
		if (rdbtnRg.isSelected()) {
			javax.swing.text.MaskFormatter doc;
			try {
				doc = new javax.swing.text.MaskFormatter("##.###.###-#");
				txtDocumento = new javax.swing.JFormattedTextField(doc);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		} else{
			if (rdbtnCpf.isSelected()) {
				javax.swing.text.MaskFormatter doc;
				try {
					doc = new javax.swing.text.MaskFormatter("###.###.###-##");
					txtDocumento = new javax.swing.JFormattedTextField(doc);
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
