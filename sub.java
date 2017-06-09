import java.util.Scanner;

public class sub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = s.nextInt();
		}
		System.out.println("size of subset");
		int m = s.nextInt(),j=0,count=m,count1=0;
		int a1[] = new int[n];
		int flag = 0;
		for(int i=0;i<m;i++)
		{
			a1[i] = s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(flag == 0)
			{
			if(a1[j] == a[i])
			{int k=i;
				for(int q=0;q<m;q++)
				{
					
					if(a[k] == a1[q])
					{
						
						k++;
						count1 = --count;
						if(count1==0)
						{
							flag = 1;
							break;
						}
					}
				}
			}
		}}
		if(count1 == 0)
		{
			System.out.println("a1 is a subset of a");
		}
		else
		{
			System.out.println("a1 is a not subset of a");
		}
		

	}

}
