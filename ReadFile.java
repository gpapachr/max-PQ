import java.io.*;

public class ReadFile
{
/*the class where all the necessary actions are performed 
	in order to read and save the input file. */
	
	ReadFile(){}
	
	public int[] ReadFile(File file) throws Exception
	{
		BufferedReader size = new BufferedReader(new FileReader(file));
		int lines=0;
		while (size.readLine() != null)
		{
			lines++;
		}
		
		String[] stringArray = new String[lines];
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		
		for(int i=0; i<lines; i++)
		{
			stringArray[i] = br.readLine();
		}
	
		int[] intArray = new int[lines];
	
		for(int i=0 ; i<lines ; i++)
		{
			intArray[i] = Integer.parseInt(stringArray[i]);
		}

		return intArray;
	}
}
	