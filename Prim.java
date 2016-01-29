package problema1;
import java.util.ArrayList;
import java.util.List;
public class Prim {
	private List<Integer> primSumList = new ArrayList<Integer>();
	private List<Integer> primSumTerms = new ArrayList<Integer>();
	private List<Integer> primNumList = new ArrayList<Integer>();
	
	public boolean  isPrim(int numar)
	{
		int limita=(int)Math.floor(Math.sqrt(numar));
		if(numar==0 || numar==1)
			return false;
		if(numar==2)
			return true;
		int i;
		for(i=2;i<=limita;i++)
		{
			if(numar%i==0)
			return false;
			
		}
		return true;
		
	}

	public void LargePrim(int min,int max)
	{
		if (max>=2)
		{
			int sumPrim=0;
			int k,dim,minim=0;
			int i;
			for ( i=0 ;i<=max;i++)
			{
				if(isPrim(i))
				{
					primNumList.add(i);
				}
			}
			for ( i = min; i <= max; i++)
			{
				if (isPrim(i)) {
					minim = i;
					break;
				}
			}

			for ( i = primNumList.indexOf(minim); i < primNumList.size(); i++)
			{
				k = 0;

			 int j;
			 for(j=0;j<i+1;j++)
			 {
				 k=j;
				 sumPrim=0;
				 dim=0;
				 while (sumPrim<primNumList.get(i))
				 {
					 sumPrim+=primNumList.get(k);
					 k++;
					 dim++;
				 }
				 if(sumPrim==primNumList.get(i))
				 {
					 primSumList.add(sumPrim);
					 primSumTerms.add(dim);
				 }
			 }
			}
		}
			 
				
			
		
		else
		 {
			System.err.println("Nu exista numere prime in acest interval dat");
			System.exit(0);
		 }
			 }
			
	public List<Integer> getprimSumList() 
	{
		return primSumList;
	}
	public List<Integer> getprimSumTerms() 
	{
		return primSumTerms;
}
}




