
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class GameFrame extends JFrame
{
	public GameFrame(String name)
	{
		super(name);
		setVisible(true);
	}
	private final GraphicsConfiguration gfxConf = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
	public void bigPaint(Graphics g)
	{
		
	}
	private BufferedImage offImg;
	public void paint(Graphics g)
	{
		if(offImg == null || offImg.getWidth() != getWidth() || offImg.getHeight() != getHeight())
		{
			offImg = gfxConf.createCompatibleImage(getWidth(), getHeight());
			bigPaint(offImg.createGraphics());
		}
		
		g.drawImage(offImg,  0,  0, this);
		offImg = null;
	}
}

