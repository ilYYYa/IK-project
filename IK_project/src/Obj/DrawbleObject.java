package Obj;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public abstract class DrawbleObject
{
	public int posX = 0;
	public int posY = 0;
	public int localPosX = 0;
	public int localPosY = 0;
	public int width = 0;
	public int height = 0;
	
	public abstract void draw(Graphics g);
	
	public void onMouseClick(MouseEvent event){}
	public void onMousePress(MouseEvent event){}
	public void onMouseRelease(MouseEvent event){}

	public void onKeyPress(KeyEvent event){}
	public void onKeyRelease(KeyEvent event){}
}
