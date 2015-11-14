package boundary;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class TelaPrincipal implements ActionListener{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal window = new TelaPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 713, 506);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnEstatistica = new JButton("Estatística");
		btnEstatistica.setBounds(422, 408, 151, 39);
		frame.getContentPane().add(btnEstatistica);
		
		JButton btnEmprestimo = new JButton("Emprestimo de Obras");
		btnEmprestimo.setBounds(292, 397, 151, 39);
		frame.getContentPane().add(btnEmprestimo);
		
		JPanel pnCadastro = new JPanel();
		pnCadastro.setBorder(new TitledBorder(null, "Cadastrar", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnCadastro.setBounds(62, 233, 547, 134);
		frame.getContentPane().add(pnCadastro);
		pnCadastro.setLayout(null);
		
		JButton btnObra = new JButton("");
		btnObra.setBounds(110, 28, 117, 60);
		pnCadastro.add(btnObra);
		btnObra.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/icon/img-paint.png")));
		
		JLabel lblObras = new JLabel("Obras");
		lblObras.setBounds(148, 100, 55, 16);
		pnCadastro.add(lblObras);
		
		JButton btnAutor = new JButton("");
		btnAutor.setBounds(272, 28, 117, 60);
		pnCadastro.add(btnAutor);
		btnAutor.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/icon/img-pen.png")));
		
		JLabel lblAutores = new JLabel("Autores");
		lblAutores.setBounds(306, 100, 55, 16);
		pnCadastro.add(lblAutores);
		btnEstatistica.addActionListener(this);
		
		//

		
		JPanel pnVenda = new JPanel();
		pnVenda.setBorder(new TitledBorder(null, "Venda", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnVenda.setBounds(62, 93, 547, 134);
		frame.getContentPane().add(pnVenda);
		pnVenda.setLayout(null);
		
		JButton btnVenda = new JButton("");
		btnVenda.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/icon/img-ticket.png")));
		btnVenda.setBounds(110, 28, 117, 60);
		pnVenda.add(btnVenda);
		
		JLabel lblIngressos = new JLabel("Ingressos");
		lblIngressos.setBounds(142, 100, 69, 16);
		pnVenda.add(lblIngressos);
		
		pnCadastro.setOpaque(false);
		pnVenda.setOpaque(false);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if ("Cadastrar Visitante".equals(cmd)) {
			TelaVisitante tv = new TelaVisitante();
			tv.main(null);
		}
		if ("Estatística".equals(cmd)) {
			TelaGrafico tg = new TelaGrafico();
			tg.main(null);
		}
		if ("Sair".equals(cmd)) {
			System.exit(0);
		}
	}
}
