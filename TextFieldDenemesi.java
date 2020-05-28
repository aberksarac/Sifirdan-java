import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class TextFieldDenemesi extends JPanel implements ActionListener {
	JLabel label1;
	JTextField textField1;
	JButton button1;
	
	public TextFieldDenemesi() {
		super();
		label1= new JLabel();
		add(label1);
		
		textField1 = new JTextField(10);
		textField1.addActionListener(this);
		add(textField1);
		
		/*button1= new JButton("Tamam");
		button1.addActionListener(this);
		add(button1);*/
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame("Deneme Programý");
		TextFieldDenemesi panel1 = new TextFieldDenemesi();
		frame.add(panel1);
		frame.setSize(200, 200);
		frame.setVisible(true);

	}
public void actionPerformed(ActionEvent e) {
		
		//if(e.getActionCommand().equals("Tamam"))
		{
			label1.setText( label1.getText() + textField1.getText());
			textField1.setText(" ");
			textField1.requestFocus();
		}
		/*else if(e.getActionCommand().equals("Azalt"))
		{
			/*int a= Integer.parseInt(label1.getText());
			a=a-1;
			label1.setText(""+ a);
		}*/
}
}
