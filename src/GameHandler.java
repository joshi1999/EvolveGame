import javax.swing.JFrame;

public class GameHandler 
{
	int m_WindowWidth = 800;
	int m_WindowHeight = 800;
	GameFrame frame;
	public GameHandler() throws InterruptedException
	{
		frame = new GameFrame("Evolving Game");
		frame.setSize(m_WindowWidth, m_WindowHeight);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.addKeyListener(new KeyHandler());
		frame.addMouseListener(new MouseHandler());
		Level level1 = LevelLoader.getLevel("Level1");
		System.out.print(level1.LevelData.size());
		stepIntoGameLoop();
	}
	
	public void stepIntoGameLoop() throws InterruptedException
	{
		while(true)
		{
			Thread.sleep(1000/60);
			frame.repaint();
			doCalculations();
		}
	}
	
	public void doCalculations()
	{
		
	}
}