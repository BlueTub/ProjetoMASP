package boundary.custom;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.border.LineBorder;

public class JButtonCustom extends JButton{
	
	public JButtonCustom(String texto){
		this.setText(texto);
		customizar();
	}
	
	public JButtonCustom(){
		customizar();
	}
	
	public void customizar(){
		Color cor = new Color(180, 180, 180);
		this.setBackground(cor);
		cor = new Color(255, 255, 255);
		this.setForeground(cor);
		Font fonte = new Font("Verdana", 1, 20);
		this.setFont(fonte);
		this.setBorder(new LineBorder(new Color(200, 200, 200)));
	}
	
	
	


}
