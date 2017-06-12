import java.util.Scanner;

public class Target {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("size of array");
		int n = s.nextInt();
		System.out.println("Target");
		int target = s.nextInt(),h=0,v=0;
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = s.nextInt();
		}
			for(int j=0;j<n;j++)
			{
				for(int k=n-1;k>=0;k--)
				{
					if(j!=k)
					{
						if(target ==(a[j]+a[k]))
						{
							h = a[j];
							v = a[k];
							
							System.out.println("Target is the sum of "+h+" "+v);
						}
					}
				}
			}
		
	}

}
