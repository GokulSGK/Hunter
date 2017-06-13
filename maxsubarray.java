package Vegeta;

import java.util.ArrayList;
import java.util.Scanner;

public class maxsubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		int n = s1.length();
		int m=0;
		ArrayList <String> al = new ArrayList<String>();
		for(int i=0;i<n-1;i++)
		{
			for(int j=i;j<n-1;j++)
			{
				String s2 = (s1.substring(i, j+1));
			
					al.add(s2);
				
			}
		}
		
		int length = 1;
		for(int i = 0;i<al.size();i++)
		{
			String k = al.get(i);
			if(k.length() > length)
			{
				m = i;
				length = k.length();
			}
		}
		
		System.out.println("Largest substring of "+al.get(m)+" "+al.get(m).length());

	}

}
