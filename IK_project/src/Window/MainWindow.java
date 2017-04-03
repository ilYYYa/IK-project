package Window;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MainWindow extends JFrame
{
	public MainWindow()
	{
		this.setBounds(0, 0, (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(), (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight());
		this.setTitle("Title");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setUndecorated(true);
		
		this.setVisible(true);
		
		while(true)
		{
			repaint();
		}
	}
	
	int xx = 0;
	
	@Override
	public void paint(Graphics g)
	{
		g.setColor(new Color(0,0,0));
		g.drawRect(xx, 100, 200, 200);
		xx++;
	}
}
