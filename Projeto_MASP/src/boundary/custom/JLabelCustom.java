package boundary.custom;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class JLabelCustom extends JLabel{

	public JLabelCustom() {
		customizar();
	}
	
	public JLabelCustom(String texto){
		this.setText(texto);
		customizar();
	}
	
	public void customizar(){
		Font fonte = new Font("Verdana", 0, 19);
		this.setFont(fonte);
	}

}
