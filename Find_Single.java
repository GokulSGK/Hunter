package list;
import java.util.*;
public class Find_Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int c=0;
			for(int j=0;j<n;j++)
			{
				if(i !=j && a[i] == a[j])
					c++;
			}
			if(c != 1){
				System.out.println(a[i]);
				break;
			}
		}

	}

}
