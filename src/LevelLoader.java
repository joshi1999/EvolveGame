import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LevelLoader 
{
	public static Level getLevel(String levelName)
	{
		String levelFile = "src/Level/" + levelName + "/level.csv";
		String line = "";
		String csvSplitBy = ",";
		Level tempLevel = new Level(levelName, "Dominik", levelName, 50, 50);
		tempLevel.Title = levelName;
		
		try(BufferedReader br = new BufferedReader(new FileReader(levelFile)))
		{
			int x = 0;
			while((line = br.readLine()) != null)
			{
				String[] tileType = line.split(csvSplitBy);
				
				
				for(int y = 0; y < tileType.length; y++)
				{
					tempLevel.ChangeTileType(x, y, Integer.parseInt(tileType[y]));
				}
				x++;
			}
		}
		catch(IOException e)
		{
			System.err.println("Couldn't load Leveldata for Level '" + levelName + "'. Please inform the developer!");
		}
		return tempLevel;
	}
	public static Level getObjectsLayer(String levelName)
	{
		String levelFile = "src/Level/" + levelName + "/objects.csv";
		String line = "";
		String csvSplitBy = ",";
		Level tempLevel = new Level(levelName, "Dominik", levelName, 50, 50);
		tempLevel.Title = levelName;
		
		try(BufferedReader br = new BufferedReader(new FileReader(levelFile)))
		{
			int x = 0;
			while((line = br.readLine()) != null)
			{
				String[] tileType = line.split(csvSplitBy);
				
				
				for(int y = 0; y < tileType.length; y++)
				{
					tempLevel.ChangeTileType(x, y, Integer.parseInt(tileType[y]));
				}
				x++;
			}
		}
		catch(IOException e)
		{
			System.err.println("Couldn't load Leveldata for Level '" + levelName + "'. Please inform the developer!");
		}
		return tempLevel;
	}
}
