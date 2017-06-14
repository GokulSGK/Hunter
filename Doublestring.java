package Vegeta;

import java.util.Scanner;

public class Doublestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner s = new Scanner(System.in);
        String s1=s.next();
        char c[] = s1.toCharArray();
        int count=1,count1=0,j=0;
        for(int i=0;i<s1.length()-2;i++)
        {
        	j = i+1;
        	if(c[i] == c[j])
        	{
        		count++;
        	}
        }
        if(count == 1)
        {
        	System.out.println("Not Doublie Strings");
        }
        else
        {
        	System.out.println("Double Strings");
        }
        

	}

}
