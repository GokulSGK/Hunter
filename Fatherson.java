package hunter;
import java.util.*;
public class Fatherson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int i=s.nextInt(),j=s.nextInt();
		int count=0;
		s.nextLine();
		String s1[][] = new String[i][j];
		for(int k=0;k<i;k++)
		{
			for(int l=0;l<j;l++)
			{
				s1[k][l]=s.nextLine();
			}
		}
		System.out.println("Enter the name");
		String s3="";
		String s2 = s.nextLine();
		for(int k=0;k<i;k++)
		{
			if(s2.equals(s1[k][1]))
			{
				s3=s1[k][0];
			
				
			}
		}
		for(int l=0;l<i;l++)
		{
			if(s3.equals(s1[l][1]))
			{
				
				count++;
			}
		}
		System.out.println(count+" Grandchildren ");
		
	}

}
