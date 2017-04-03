package Scene;

import Panel.TestingPanel;

public class TestingScene extends GlobalScene
{
	public TestingScene(int w, int h)
	{
		super(w, h);
		this.addPanel(new TestingPanel(0, 0, 200, height));
	}
}
