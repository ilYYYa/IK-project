package Panel;

import java.awt.Graphics;

import Obj.DrawbleObject;

public abstract class GlobalPanel extends DrawbleObject
{
	public int posX = 0;
	public int posY = 0;
	public int width = 0;
	public int hight = 0;
	
	public abstract void draw(Graphics g);

}
