package Scene;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import Obj.DrawbleObject;
import Panel.GlobalPanel;

public class GlobalScene extends DrawbleObject
{
	public ArrayList<GlobalPanel> panels = new ArrayList<GlobalPanel>();
	
	public GlobalScene(int w, int h)
	{
		width = w; height = h;
	}
	
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
	
	@Override
	public void onMouseClick(MouseEvent event)
	{
		for(int i = panels.size() - 1; i >= 0; i--)
		{
			if(panels.get(i).posX <= event.getX() && panels.get(i).posX + panels.get(i).width >= event.getX() &&
					panels.get(i).posY <= event.getY() && panels.get(i).posY + panels.get(i).height >= event.getY())
			{
				panels.get(i).onMouseClick(event);
				break;
			}
		}
	}
	@Override
	public void onMousePress(MouseEvent event)
	{
		for(int i = panels.size() - 1; i >= 0; i--)
		{
			if(panels.get(i).posX <= event.getX() && panels.get(i).posX + panels.get(i).width >= event.getX() &&
					panels.get(i).posY <= event.getY() && panels.get(i).posY + panels.get(i).height >= event.getY())
			{
				panels.get(i).onMousePress(event);
				break;
			}
		}
	}
	@Override
	public void onMouseRelease(MouseEvent event)
	{
		for(int i = panels.size() - 1; i >= 0; i--)
		{
			if(panels.get(i).posX <= event.getX() && panels.get(i).posX + panels.get(i).width >= event.getX() &&
					panels.get(i).posY <= event.getY() && panels.get(i).posY + panels.get(i).height >= event.getY())
			{
				panels.get(i).onMouseRelease(event);
				
				GlobalPanel panelBuff = panels.get(i);
				panels.set(i, panels.get(i));
				panels.set(panels.size() - 1, panelBuff);
				break;
			}
		}
	}

	@Override
	public void onKeyPress(KeyEvent event)
	{
		if(panels.size() > 0) panels.get(panels.size() - 1).onKeyPress(event);
	}
	@Override
	public void onKeyRelease(KeyEvent event)
	{
		if(panels.size() > 0) panels.get(panels.size() - 1).onKeyRelease(event);
	}
}
