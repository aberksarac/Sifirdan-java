import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class CheckBoxPaneli extends JPanel implements ActionListener {
	JCheckBox check1,check2;
	JButton button1;
	
	
	
	public CheckBoxPaneli() {

		check1 = new JCheckBox("Yurtta kal�yor");
		add(check1);
		check2 = new JCheckBox("Burslu");
		add(check2);
		
		button1 = new JButton("Onayla");
		button1.addActionListener(this);
		add(button1);
		
		
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		String s = "Se�ti�iniz ��renci ";
		if(check1.isSelected())
		{
			s+="yurtta kal�yor ";
		}
		else
		{
			s+="yurtta kalm�yor ";
		}
		if(check2.isSelected())
		{
			s+="burslu ";
		}
		else
		{
			s+="burssuz ";
		}
		JOptionPane.showMessageDialog(this, s);

	}
	
	
}
