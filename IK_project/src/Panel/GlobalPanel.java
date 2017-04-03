package Panel;

import java.awt.Graphics;
import java.util.ArrayList;

import Obj.DrawbleObject;

public class GlobalPanel extends DrawbleObject
{
	public ArrayList<DrawbleObject> objectsForDraw = new ArrayList<DrawbleObject>();
	
	public void addObjectForDraw(DrawbleObject obj)
	{
		objectsForDraw.add(obj);
	}
	
	
	public GlobalPanel(int x, int y, int w, int h)
	{
		posX = x;
		posY = y;
		width = w;
		height = h;
	}
	
	public void draw(Graphics g)
	{
		for(int i = 0; i < objectsForDraw.size(); i++)
		{
			objectsForDraw.get(i).posX = this.posX + objectsForDraw.get(i).localPosX;
			objectsForDraw.get(i).posY = this.posY + objectsForDraw.get(i).localPosY;
			objectsForDraw.get(i).draw(g);
		}
	}

}
