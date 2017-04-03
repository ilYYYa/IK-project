package Window;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

import Obj.DrawbleObject;

public class DoubleBuffer extends JPanel
{
	public ArrayList<DrawbleObject> objectsForDraw = new ArrayList<DrawbleObject>();
	
	public void addObjectForDraw(DrawbleObject obj)
	{
		objectsForDraw.add(obj);
	}
	
	@Override
	public void paint(Graphics g)
	{
		for(int i = 0; i < objectsForDraw.size(); i++)
		{
			objectsForDraw.get(i).draw(g);
		}
	}
}
