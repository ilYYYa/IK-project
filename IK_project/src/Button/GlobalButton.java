package Button;

import java.awt.Color;
import java.awt.Graphics;

import Obj.DrawbleObject;

public class GlobalButton extends DrawbleObject
{
	public Color bgColor = new Color(200,200,200);
	public Color borderColor = new Color(255,255,255);
	public Color textColor = new Color(0,0,0);
	
	public String Text = "";

	public GlobalButton(int x, int y, int w, int h)
	{
		localPosX = x; localPosY = y; width = w; height = h;
	}
	
	@Override
	public void draw(Graphics g)
	{
		g.setColor(bgColor);
		g.fillRect(posX, posY, width, height);
		g.setColor(borderColor);
		g.drawRect(posX, posY, width, height);
		g.setColor(textColor);
		g.drawString(Text, posX + 5, posY + height/2);
	}
	
	public GlobalButton setText(String text)
	{
		Text = text;
		return this;
	}
	
	public GlobalButton setBorderColor(int r, int g, int b)
	{
		borderColor = new Color(r,g,b);
		return this;
	}

	public GlobalButton setTextColor(int r, int g, int b)
	{
		textColor = new Color(r,g,b);
		return this;
	}

	public GlobalButton setBackgroundColor(int r, int g, int b)
	{
		bgColor = new Color(r,g,b);
		return this;
	}
}
