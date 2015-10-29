package boundary.custom;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.border.LineBorder;


public class JTextFieldCustom extends JTextField{

	public JTextFieldCustom(){
		Font f = new Font("Arial", 0, 18);
		this.setFont(f);
		Color cor = new Color(255, 255, 255);
		this.setBackground(cor);
		this.setBorder(new LineBorder(new Color(0, 0, 0)));
	}

}
