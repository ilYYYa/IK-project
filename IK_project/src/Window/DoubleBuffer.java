package Window;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DoubleBuffer extends JPanel
{
	int xx = 0;
	
	@Override
	public void paint(Graphics g)
	{
		g.setColor(new Color(0,0,0));
		g.drawRect(xx, 100, 200, 200);
		xx++;
	}
}
