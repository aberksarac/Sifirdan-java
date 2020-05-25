import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;


public class YeniPanel extends JPanel implements ActionListener, MouseListener {
	
	D�rtgen[]digerleri;
	int adim=5;
	int elemanSayisi = 5;
	
	Timer zaman;
	
	Random random= new Random();
	
	public YeniPanel()
	{
		super();
			
		digerleri = new D�rtgen[50];
		digerleri[0]= new D�rtgen(10,10,20,20,random.nextInt(10),random.nextInt(10));
		digerleri[1]= new D�rtgen(50,40,20,20,random.nextInt(10),random.nextInt(10));
		digerleri[2]= new D�rtgen(220,30,20,20,random.nextInt(10),random.nextInt(10));
		digerleri[3]= new D�rtgen(110,210,20,20,random.nextInt(10),random.nextInt(10));
		digerleri[4]= new D�rtgen(110,110,20,20,random.nextInt(10),random.nextInt(10));
		addMouseListener(this);
		zaman = new Timer(40,this);
		zaman.start();}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(0, 0, 620, 460);
		for (int i=0;i<elemanSayisi;i++)
		{
			digerleri[i].ekranCiz(g);
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		for (int i=0;i<elemanSayisi;i++)
		{
			digerleri[i].hareketEt(digerleri,elemanSayisi);
		}
		
		repaint();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		digerleri[elemanSayisi]= 
				new D�rtgen( e.getX(),e.getY(),20,20,
						random.nextInt(10),random.nextInt(10));
		elemanSayisi++;
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
