package boundary;

import java.awt.EventQueue;

import boundary.custom.JFrameCustom;
import boundary.custom.JPanelCustom;

public class MainBoundary extends JFrameCustom{

	JPanelCustom painel;

	public MainBoundary(){

		painel = new ObraBoundary();
		this.setContentPane(painel);
		painel.setBounds(0, 0, this.getWidth(), this.getHeight());

	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainBoundary tela = new MainBoundary();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
