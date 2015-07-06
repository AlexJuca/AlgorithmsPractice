
public class DynamicConnectivity {

	
	public static void main(String[] args) {
		
		int N = 15;
		int c = 0;
		int list[] = {4, 3, 3, 8, 6, 5, 9, 4, 2, 1 ,8, 9, 5 ,0 , 7, 2, 6 , 1, 1 ,0, 6, 7};
		QuickFindUF uF = new QuickFindUF(N);
		while(c < 15){
			int q;
			int p;
			for(int i = 0; i < N; i++)
			{
				  p = list[i];
				  q = list[i + 1];
				  uF.printID();
				  if(!uF.connected(p, q)){
					  uF.union(p, q);
					  uF.printID();
					  System.out.println(p +" " + q);
				  }
				  
			}
			c += 1;
		}
		uF.printID();

	}

}
