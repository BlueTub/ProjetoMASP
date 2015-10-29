package boundary.custom;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.border.LineBorder;

public class JComboBoxCustom extends JComboBox{

	public JComboBoxCustom(){
		Font f = new Font("Verdana", 0, 15);
		this.setFont(f);
		Color cor = new Color(255, 255, 255);
		this.setBackground(cor);
		this.setBorder(new LineBorder(new Color(0, 0, 0)));

	}
}
