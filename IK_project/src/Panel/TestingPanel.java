package Panel;

import java.awt.Graphics;

import Button.TestingButton;

public class TestingPanel extends GlobalPanel
{

	public TestingPanel(int x, int y, int w, int h)
	{
		super(x, y, w, h);
		this.addObjectForDraw(new TestingButton(10,10,width-20,40));
	}

	@Override
	public void draw(Graphics g)
	{
		this.posX++;
		g.fillRect(posX + 5, posY + 5, width - 10, height - 10);
		super.draw(g);
	}

}
