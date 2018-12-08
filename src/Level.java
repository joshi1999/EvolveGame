import java.util.ArrayList;

public class Level 
{
	public ArrayList<CoordData> LevelData;
	public String Title;
	public String Author;
	public String Description;
	
	public Level()
	{
		
	}
	
	public Level(String title, String author, String description, int x, int y)
	{
		Title = title;
		Author = author;
		Description = description;
		LevelData = new ArrayList<>();
		for(int xAdd = 0; xAdd < x; xAdd++)
		{
			for(int yAdd = 0; yAdd < y; yAdd++)
			{
				LevelData.add(new CoordData(xAdd, yAdd));
			}
		}
	}
	
	public void ChangeTileType(int x, int y, int changeTo)
	{
		CoordData data = FindCoordData(x, y);
		data.TileType = changeTo;
	}
	
	public void ChangeItem(int x, int y, int changeTo, int amount)
	{
		CoordData data = FindCoordData(x, y);
		data.ItemType = changeTo;
		data.ItemAmount = amount;
	}
	
	public void SetEnemySpawn(int x, int y, boolean isEnemySpawn)
	{
		CoordData data = FindCoordData(x, y);
		data.IsEnemySpawn = isEnemySpawn;
	}
	
	public int getTileTypeAt(int x, int y)
	{
		return FindCoordData(x, y).TileType;
	}
	
	private CoordData FindCoordData(int x, int y)
	{
		for(CoordData partData : LevelData)
		{
			if(partData.X == x && partData.Y == y)
			{
				return partData;
			}
		}
		return null;
	}
}
