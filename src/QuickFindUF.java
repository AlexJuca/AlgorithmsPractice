
public class QuickFindUF {
	
	private int[] id;
	
	public QuickFindUF(int N)
	{	int[] id = new int[N];
		for (int i = 0; i < N; i++)
		{
			id[i] = i;
			// System.out.println(" id[i] : " + i);
		}
		this.id = id;
			
	}
	
	public void printID(){
		
		for (int i = 0; i < this.id.length; i++)
			System.out.println(" ID: " + id[i]);
	}
	

	public boolean connected(int p, int q)
	{
		// System.out.println(this.id[p] + " : " + this.id[q]);
		return this.id[p] == this.id[q];
	}
	
	public void union(int p, int q)
	{
		int pid = this.id[p];
		int qid = this.id[q];
		for (int i = 0; i < this.id.length; i++)
			if(this.id[i] == pid) this.id[i] = qid;
				
	}
	
}
