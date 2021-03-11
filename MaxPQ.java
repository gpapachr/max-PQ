public class MaxPQ{
	
	private boolean less(Disk[] a, int i, int j)
	{
		return a[i].compareTo(a[j]) == -1;
	}
	
	private void exch(Disk[] d, int i,  int j)
	{
		Disk t = d[i];
		d[i] = d[j];
		d[j] = t;
	}
	
	private void swim(Disk[] a, int k)
	{
		while (k>1 && less(a, k/2, k))
		{
			exch(a, k, k/2);
			k = k/2;
		}
	}
	
	private void sink(Disk[] a, int k, int N)
	{
		while (2*k <= N){
			int j = 2*k;
			if (j < N && less(a, j, j+1))
			{
				j++;
			}
			if (!less(a, k, j))
			{
				break;
			}
			exch(a, k, j);
			k = j;
		}
	}
	
	
	private Disk[] pq;
	private int N;
	
	MaxPQ(int maxN)
	{
		pq = new Disk[maxN+1];
		N = 0;
	}
	
	boolean isEmpty()
	{
		return N==0;
	}
	
	void insert(Disk v)
	{
		pq[++N] = v;
		swim(pq, N);
		
	}
	
	Disk getmax()
	{
		exch(pq, 1, N);
		sink(pq, 1, N-1);
		return pq[N--];
	}
	
	
}
		