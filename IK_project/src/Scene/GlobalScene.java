package Scene;

import java.awt.Graphics;
import java.util.ArrayList;

import Obj.DrawbleObject;
import Panel.GlobalPanel;

public class GlobalScene extends DrawbleObject
{
	public ArrayList<GlobalPanel> panels = new ArrayList<GlobalPanel>();
	
	public void addPanel(GlobalPanel panel)
	{
		panels.add(panel);
	}
	
	@Override
	public void draw(Graphics g)
	{
		for(int i = 0; i < panels.size(); i++)
		{
			panels.get(i).draw(g);
		}
	}
}
