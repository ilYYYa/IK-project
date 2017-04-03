package Obj;

import java.awt.Graphics;

public abstract class DrawbleObject
{
	public int posX = 0;
	public int posY = 0;
	public int localPosX = 0;
	public int localPosY = 0;
	public int width = 0;
	public int height = 0;
	
	public abstract void draw(Graphics g);
}
