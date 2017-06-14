package hunter;
import java.util.*;
public class Numgreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String s1 = String.valueOf(n);
		String a[] = new String[s1.length()];
		int k = 0;
	
		/*while(n>0)
		{
			int t = n%10;
			
			a[i] = t;
			i++;
			n = n/10;
		}*/
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s1.length()-1;j++)
			{
				      
				
				a[k] = s1.substring(i,j+1);
				k++;
			}
		}
		Arrays.sort(a);
		int m = Integer.valueOf(a[a.length-1]); 
		int m1 = Integer.valueOf(a[a.length-2]); 
		//String v = String.valueOf(n);
		if(m==n)
		{
			System.out.print("Not Possible");
		}
		if(m1 > n)
		{
			System.out.print(a[a.length-1]);
		}
		

	}

}
