import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class RadioButtonPaneli extends JPanel implements ActionListener{
	
	JLabel label1, label2;
	JRadioButton radio1,radio2,radio3,radio4;
	JRadioButton r1,r2;
	JButton button1;
	ButtonGroup grup1, grup2;
	
	public RadioButtonPaneli() {
		
		//Gruplar Oluþturuldu
		
		grup1 = new ButtonGroup();
		grup2 = new ButtonGroup();
		
		//Label Adlarý
		
		label1 = new JLabel("Sýnýfýnýzý seçiniz: ");
		label2 = new JLabel("Cinsiyet: ");
		
		//Radio Buttonlar Oluþturuldu
		
		radio1 = new JRadioButton("1. Sýnýf");
		radio2 = new JRadioButton("2. Sýnýf");
		radio3 = new JRadioButton("3. Sýnýf");
		radio4 = new JRadioButton("4. Sýnýf");
		
		r1 = new JRadioButton("Erkek");
		r2 = new JRadioButton("Kadýn");
		
		button1 = new JButton("Sýnýfý Seç!");
		button1.addActionListener(this);
		
		//Sýnýf Sorusu
		
		add(label1);
		
		grup1.add(radio1);
		grup1.add(radio2);
		grup1.add(radio3);
		grup1.add(radio4);
		
		grup2.add(r1);
		grup2.add(r2);
		
		
		add(radio1);
		add(radio2);
		add(radio3);
		add(radio4);
		
		//Cinsiyet
		
		add(label2);
		
		add(r1);
		add(r2);
		
		add(button1);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String s = "Seçilen sýnýf ";
		
		boolean sýnýf = false;
		
		if(radio1.isSelected()){
			s+= radio1.getText();
			sýnýf = true;
		}
		else if(radio2.isSelected()){
			s+= radio2.getText();
			sýnýf = true;
		}
		else if(radio3.isSelected()){
			s+= radio3.getText();
			sýnýf = true;
		}
		else if(radio4.isSelected()){
			s+= radio4.getText();
			sýnýf = true;
		}
		else {
			s = "Lütfen Sýnýf Seçiniz!";
			sýnýf = false;
			
		}
		if(sýnýf){
			if(r1.isSelected()){
				s+= ", cinsiyet " + r1.getText();
			}
			else if(r2.isSelected()){
				s+=  ", cinsiyet " + r2.getText();
			}
			else {
				s = "Lütfen Cinsiyet Seçiniz!";
			
			}
		}
		
		
		
		JOptionPane.showMessageDialog(this, s);
		
	}

}
