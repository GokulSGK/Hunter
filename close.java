import java.util.Scanner;

public class close {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("size of array");
		int n = s.nextInt();
		int close = 0,u=0,v=0;
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = s.nextInt();
		}
		close = a[0] + a[1];
		int b=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				b = a[i] + a[j];
				if(close > b)
				{
					u = a[i];
					v = a[j];
					close = b;
					
				}
			}
		}
		System.out.println(u+" "+v);

	}

}
