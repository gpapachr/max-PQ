public class Sort
{/* A very simple implementation of inverted quicksort. 
    It sorts the elements of the input Array in descending order*/
    
	Sort(){}
	
	private void exch(int[] a, int i,  int j)
	{
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	private int partition(int a[], int l, int r) 
    { 
        int pivot = a[r];  
        int i = (l-1); 
        for (int j=l; j<r; j++) 
        { 
            if (a[j] > pivot) 
            { 
                i++; 
                exch(a, i, j);
            } 
        } 
  
        exch(a, i+1, r); 
  
        return i+1; 
    }

    public void quicksort(int a[], int l, int r) 
    { 
        if (l < r) 
        { 
            int p = partition(a, l, r); 
            quicksort(a, l, p-1); 
            quicksort(a, p+1, r); 
        } 
    } 
}
	
		 