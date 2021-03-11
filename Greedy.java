import java.io.*;
public class Greedy
{
	
	public static void main(String[] args) throws Exception
	{
		File file = new File("folders.txt");		
		ReadFile r  = new ReadFile();
		int[] intArray = r.ReadFile(file);
		int lines = intArray.length;
		
		double totalSize = 0;
		
		for(int c=0 ; c<lines ; c++)
		{
			if (intArray[c]<0 || intArray[c]>1000000)
			{
				System.out.println("Invalid file size. File sizes must be from 0 to 1.000.000 Mb");
				throw new Exception();
			}
			
			else{
				totalSize += intArray[c];
			}				
		}
		
		int idGenerator = 1;
		MaxPQ pq = new MaxPQ(lines); 		//worst case: we are going to need one disk for each folder
		Disk d = new Disk(idGenerator++);
		pq.insert(d);
		
		
		for (int i=0 ; i<lines ; i++)
		{
			Disk m = pq.getmax();
			if (intArray[i] > m.getFreeSpace())
			{   
				Disk n = new Disk(idGenerator++);
				n.f.insertFolder(intArray[i]);
				n.updateFreeSpace(intArray[i]);
				pq.insert(n);
			}
			
			else{
				m.f.insertFolder(intArray[i]);
				m.updateFreeSpace(intArray[i]);
			}
			pq.insert(m);
		}
		
		System.out.println("Sum of all folders = " + (totalSize/1000000) + " TB");
		System.out.println("Total number of disks used = " + (idGenerator-1));
		System.out.println("-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-");
		
		if (lines<=100)
		{
			for (int i=0 ; i<(idGenerator-1) ; i++)
			{
				Disk p = pq.getmax();
				System.out.println("id: " + p.getId() + ", Free Space: " + p.getFreeSpace() + ", Files Inside: " + p.f.toString());
			}
		}
	}
}
	
