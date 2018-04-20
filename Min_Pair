package list;
import java.util.*;
public class Min_Pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n],t1=0,t2=0,t3=10000;
		for(int i=0;i<n;i++)
		{
			a[i] = s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				int t4 = a[i]+a[j];
				if(t4<t3)
				{
					t3=t4;
					t1=a[i];
					t2=a[j];
				}
			}
		}
		System.out.println(t1+" "+t2);

	}

}
