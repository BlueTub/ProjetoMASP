package boundary.custom;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class JPanelCustom extends JPanel{
	
	public JPanelCustom(){
		this.setBorder(new LineBorder(new Color(200, 200, 200)));
		this.setLayout(null);
		this.setBackground(new Color(255, 255, 255));
		
	}

}
