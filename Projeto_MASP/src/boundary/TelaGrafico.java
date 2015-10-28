package boundary;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.JFXPanel;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.Group;
import javax.swing.DefaultComboBoxModel;

public class TelaGrafico implements ActionListener {

	private static final int frmX=100;
	private static final int frmY=100;
	private static final int frmW=664;
	private static final int frmH=481;
	
	private JFrame frmGrafico;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaGrafico window = new TelaGrafico();
					window.frmGrafico.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaGrafico() {
		initialize();
	}

	private static void initFxLater(JFXPanel panel){
		Group root = new Group();
        Scene scene = new Scene(root, 400, 400);

		ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
				new PieChart.Data("-12", 13),
				new PieChart.Data("13-19", 25),
				new PieChart.Data("20-30", 10),
				new PieChart.Data("30-60", 22),
				new PieChart.Data("+60", 30));
		PieChart chart = new PieChart(pieChartData);
		chart.setTitle("Idade");

		((Group) scene.getRoot()).getChildren().add(chart);
		 
        panel.setScene(scene);
    }
	
	@SuppressWarnings({ "rawtypes", "deprecation" })
	private void initialize() {
		frmGrafico = new JFrame(); frmGrafico.setTitle("Grafico dos Visitantes");
		frmGrafico.setBounds(frmX, frmY, frmW, frmH);
		frmGrafico.setDefaultCloseOperation(JFrame.DEFAULT_CURSOR);
		frmGrafico.getContentPane().setLayout(null);

		JButton btnVoltar = new JButton("Voltar");
		//ImageIcon(TelaGrafico.class.getResource("/br/eng/icon/img-voltar.png")));
		btnVoltar.setBounds(10, 394, 108, 38);
		btnVoltar.addActionListener(this);
		frmGrafico.getContentPane().add(btnVoltar);
		
		JLabel lblFiltro = new JLabel("Filtrar por :");
		lblFiltro.setBounds(10, 14, 54, 14);
		frmGrafico.getContentPane().add(lblFiltro);
 		
		JComboBox cmbFiltro = new JComboBox();
		cmbFiltro.setModel(new DefaultComboBoxModel(new String[] {"Idade", "Sexo", "Nacionalidade", "Nível acadêmico", "Meio de locomoção"}));
		cmbFiltro.setBounds(74, 11, 132, 20);
		frmGrafico.getContentPane().add(cmbFiltro);
		
		final JFXPanel jFXPanel = new JFXPanel();
		jFXPanel.setBounds(10, 40, 500, 500);
        frmGrafico.add(jFXPanel);
        
        Platform.runLater(new Runnable(){
        	 
            @Override
            public void run() {
                initFxLater(jFXPanel);
            }
        });
}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if ("Voltar".equals(cmd)) {
			frmGrafico.dispose();
		}
	}
}