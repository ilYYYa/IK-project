package Window;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MainWindow extends JFrame
{
	DoubleBuffer buff = new DoubleBuffer();
	
	public MainWindow()
	{
		this.setBounds(0, 0, (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(), (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight());
		this.setTitle("Title");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setUndecorated(true);
		
		this.add(buff);
		
		this.setVisible(true);
		
		while(true)
		{
			repaint();
		}
	}
}
