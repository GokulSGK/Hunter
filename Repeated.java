import java.util.Arrays;
import java.util.Scanner;

public class Repeated {

	public static void main(String[] args) {
      
		
		int i,j=0,g=0,r=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Size:");
		int op = s.nextInt();
		int a[]=new int[op];
		for(i=0;i<op;i++)
		{
			a[i] = s.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			if(r==0)
			{
			for(j=1;j<a.length;j++)
			{
		if(a[i] == a[j])
		{
			g = a[i];
			r=1;
			break;
		}
		}}}
		
		System.out.println("First Repeated "+g);
		
		

	}

}
