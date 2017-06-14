package hunter;
import java.util.*;
public class FirstOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.nextLine();
		int c=0;
		String s1[] = new String[n];
		for(int i=0;i<n;i++)
		{
			s1[i] = s.nextLine();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(s1[i].equals(s1[j]))
				{
					c++;
					s1[i] = "a";
					s1[j] = "a";
				}
			}
		}
		
		for(int i=0;i<n;i++)
		{
			if(s1[i] != "a" )
			{
				System.out.print(s1[i]);
				break;
			}
		}

	}

}
