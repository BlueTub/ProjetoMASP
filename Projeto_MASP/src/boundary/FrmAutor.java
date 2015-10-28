package boundary;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;

public class FrmAutor extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtDataNasc;
	private JTextField txtNacionalidade;
	private JTextField txtAddMovimento;
	private JTextField txtAreaAtividade;
	private JTextField txtPeriodo;
	private JTextField txtMorte;

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
		setTitle("\t\t\t\t\t\t\t\t\tCadastrar Autor");
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
		
		JComboBox cbMovimento = new JComboBox();
		cbMovimento.setBounds(130, 207, 143, 20);
		contentPane.add(cbMovimento);
		
		txtAddMovimento = new JTextField();
		txtAddMovimento.setBounds(323, 207, 118, 20);
		contentPane.add(txtAddMovimento);
		txtAddMovimento.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(451, 206, 70, 23);
		contentPane.add(btnAdd);
		
		JLabel lblOu = new JLabel("ou");
		lblOu.setBounds(290, 210, 46, 14);
		contentPane.add(lblOu);
		
		JLabel lblAreaAtividades = new JLabel("Area (atividade) :");
		lblAreaAtividades.setBounds(23, 247, 97, 14);
		contentPane.add(lblAreaAtividades);
		
		txtAreaAtividade = new JTextField();
		txtAreaAtividade.setBounds(124, 244, 149, 20);
		contentPane.add(txtAreaAtividade);
		txtAreaAtividade.setColumns(10);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o :");
		lblDescrio.setBounds(49, 288, 71, 14);
		contentPane.add(lblDescrio);
		
		JTextPane txtpaneDescricao = new JTextPane();
		txtpaneDescricao.setBounds(130, 288, 391, 49);
		contentPane.add(txtpaneDescricao);
		
		JLabel lblPeriodo = new JLabel("Periodo de Atividade :");
		lblPeriodo.setBounds(323, 247, 118, 14);
		contentPane.add(lblPeriodo);
		
		txtPeriodo = new JTextField();
		txtPeriodo.setBounds(435, 244, 86, 20);
		contentPane.add(txtPeriodo);
		txtPeriodo.setColumns(10);
		
		JRadioButton rdbtnFalecido = new JRadioButton("Falecido");
		rdbtnFalecido.setBounds(300, 93, 82, 23);
		contentPane.add(rdbtnFalecido);
		
		txtMorte = new JTextField();
		txtMorte.setBounds(474, 94, 86, 20);
		contentPane.add(txtMorte);
		txtMorte.setColumns(10);
		
		JLabel lblDataDaMorte = new JLabel("Data da morte :");
		lblDataDaMorte.setBounds(388, 96, 76, 17);
		contentPane.add(lblDataDaMorte);
		
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
	}
}
