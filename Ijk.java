import java.util.Scanner;

public class Ijk {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("size of array");
		int n = s.nextInt(),w=0;
		int r=0,h=0,v=0;
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				for(int k=n-1;k>=0;k--)
				{
					if(i!=j && j!=k)
					{
						if(a[i]==(a[j]+a[k]))
						{
							r = a[i];
							h = a[j];
							v = a[k];
							System.out.println(r+" is the sum of "+h+" "+v);
							
						}
					}
				}
			}
		}
		
	}

}
