import java.util.Arrays;
import java.util.Scanner;

public class Unique2 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		/*StringBuffer sb=new StringBuffer();
		sb.append(s.nextLine());
		sb.reverse();*/
		int flag=0;
		int a = s.nextInt();
		int a2[] = new int[a];
		for(int i=0;i<a;i++)
		{
			a2[i] = s.nextInt();
		}
		Arrays.sort(a2);
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<a;j++)
			{
				if(a2[i]== a2[j] && i!=j)
				{
					flag=1;
				}
			}
			if(flag==0)
			{
				System.out.println(a2[i]);
			}
			flag=0;
		}

	}

}
