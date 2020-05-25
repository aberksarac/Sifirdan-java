import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ButonDenemesi extends JPanel implements ActionListener{

	JButton button1, button2;
	JLabel label1;
	
	
	public ButonDenemesi() {
		super();
		button1= new JButton("Arttýr");
		button1.addActionListener(this);
		button2= new JButton("Azalt");
		button2.addActionListener(this);
		label1 = new JLabel("0");
		add(button1);
		add(button2);
		add(label1);
	}


	public static void main(String[] args) {
		JFrame frame = new JFrame("Deneme Programý");
		ButonDenemesi panel1 = new ButonDenemesi();
		frame.add(panel1);
		frame.setSize(200, 200);
		frame.setVisible(true);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("Arttýr"))
		{
			int a= Integer.parseInt(label1.getText());
			a=a+1;
			label1.setText(""+ a);
		}
		else if(e.getActionCommand().equals("Azalt"))
		{
			int a= Integer.parseInt(label1.getText());
			a=a-1;
			label1.setText(""+ a);
		}
	}

}
