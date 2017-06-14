package Vegeta;

import java.util.Scanner;

public class threefour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		double s2 = s.nextInt();
		double n = Math.pow(2, s2);
		int n1 = (int)n;
		int count=2;int k=0;
		String s4[] = new String[4];
		String s3[] = {"3","4"};
		System.out.print("3 4");
		while(count<n1)
		{
		for(int i=0;i<s3.length;i++)
		{
			for(int j=0;j<s3.length;j++)
			{
				
			s4[k] =  s3[i].concat(s3[j]);
			System.out.print(" "+s4[k]);
			k++;
			count++;
			}
		}
		String s5[] = new String[8];
		k=0;
		for(int i=0;i<s4.length;i++)
		{
			for(int j=0;j<s3.length;j++)
			{
				
			s5[k] =  s4[i].concat(s3[j]);
			System.out.print(" "+s5[k]);
			k++;
			count++;
			}
		}
		String s6[] = new String[16];
		k=0;
		for(int i=0;i<s4.length;i++)
		{
			for(int j=0;j<s4.length;j++)
			{
				
			s6[k] =  s4[i].concat(s4[j]);
			System.out.print(" "+s6[k]);
			k++;
			count++;
			}
		}

		
		}
	}

}
