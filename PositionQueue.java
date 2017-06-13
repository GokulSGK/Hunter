package Vegeta;
import java.util.*;
public class PositionQueue {
	public static ArrayList <Integer> al = new ArrayList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(),j=0;
		int a[] = new int[n];
		int b[] = new int[n/2+1];
		for(int i=0;i<n;i++)
		{
			a[i] = s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(i%2 == 0)
			{
				b[j] = a[i];
				j++;
			}
		}
		
		
		
			int p = func(b.length, b);
			
			if(p == 1)
			{
				System.out.print(al.get(0));
			}
			else
			{
				int c[] = new int[p];
				int x=0;
				while(x<p)
				{
					c[x] = al.get(x);
					x++;
				}
				p = func(c.length, c);
				if(p == 1)
				{
					System.out.print(al.get(0));
				}
				
				
			}
			
		

	}
	public static int func(int size,int[] b)
	{
		
		al.clear();
		for(int k=0;k<size;k++)
		{
			
		   if(k%2 == 0)
		   {
			   al.add(b[k]);
			    
		   }
		}
		int li = al.size();
		return li;
	}

}
