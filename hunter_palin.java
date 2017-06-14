package Vegeta;
import java.util.*;
public class hunter_palin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s = new StringBuffer(args[0]);
		char c[] = args[0].toCharArray();
		for(int i=0;i<args[0].length();i++)
		{
			StringBuffer s2 = new StringBuffer(s);
			s2.deleteCharAt(i);
			String s3 = new String(s2);
			String s4 = new String(s2.reverse());
			if(s3.equals(s4))
			{
				System.out.println(c[i]);
				
			}
			
		}
		

	}

}
