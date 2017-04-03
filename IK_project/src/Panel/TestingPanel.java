package Panel;

import java.awt.Graphics;

public class TestingPanel extends GlobalPanel
{

	public TestingPanel(int x, int y, int w, int h)
	{
		super(x, y, w, h);
	}

	@Override
	public void draw(Graphics g)
	{
		g.fillRect(posX + 5, posY + 5, width - 10, height - 10);
	}

}
