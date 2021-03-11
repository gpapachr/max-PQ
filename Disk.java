public class Disk implements Comparable<Disk> 
{
	private int space = 1000000;
	private int id=0;
	public folders f = new folders();
		
	Disk(int id)
	{
		this.id = id;
	}
	
	public int getId()
	{
		return id;
	}
	
	public int getFreeSpace()
	{
		return space;
	}
	
	public void updateFreeSpace(int size)
	{
		int s = getFreeSpace();
		this.space = s - size;
	}
	
	
	public int compareTo(Disk disk)
	{
		if(space>disk.getFreeSpace())
		{
			return 1;
		}
		else if(space<disk.getFreeSpace())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}

			
		