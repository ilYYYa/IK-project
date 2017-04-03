package Panel;

import java.awt.Graphics;

import Obj.DrawbleObject;

public abstract class GlobalPanel extends DrawbleObject
{
	public int posX = 0;
	public int posY = 0;
	public int width = 0;
	public int height = 0;
	
	public GlobalPanel(int x, int y, int w, int h)
	{
		posX = x;
		posY = y;
		width = w;
		height = h;
	}
	
	public abstract void draw(Graphics g);

}
