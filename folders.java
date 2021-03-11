public class folders
{/*The list which is used to save the folders inside a disk */

	public folders(){}

	public class Node
	{
		protected int data;
		protected Node next = null;
		
		Node(int data)
		{
			this.data = data;
		}
	}
	
	private Node head = null;
	private Node tail = null;
		
		
	public boolean isEmpty()
	{
		return head==null;
	}
		
	public void insertFolder(int size)
	{
						
		Node n = new Node(size);
		
		if (isEmpty())
		{
			head = n;
			tail = n;
		}
		else
		{
			tail.next = n;
			tail = n;
		}
		
	}
		
				
	public String toString()
	{
		if (isEmpty())
		{
			return "There aren't folders in that Disk :( ";
		}
		
		Node current = head;
		
		StringBuilder sr = new StringBuilder();
		
		while(current != null)
		{
			sr.append(current.data);
							
			if(current.next != null)
			{
				sr.append(" ");
			}
			
			current = current.next;
		}
		
		return sr.toString();
	}
}