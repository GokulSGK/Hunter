package list;
import java.util.*;
public class EqualsK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n],t1=0,t2=0,t3=10000;
		for(int i=0;i<n;i++)
		{
			a[i] = s.nextInt();
		}
		int k = s.nextInt(),c=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]-a[j] == k || a[i]-a[j] == -k)
					c++;
			}
		}
		System.out.println(c);

	}

}
