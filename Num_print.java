package Vegeta;
import java.util.*;
public class Num_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String s2 = s.nextLine();
		for(String s1:s2.split(""))
		{  
			if(Character.isLetter(s1.charAt(0)))
			{
				System.out.print(s1);
			}
			else
			{
				int n=Integer.valueOf(s1);
				for(int g=0;g<n-1;g++)
				{
					System.out.print(s2.charAt(s2.indexOf(s1)-1));
				}
			}
		}	

	}

}
