package Vegeta;
import java.util.*;
public class Productsub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = s.nextInt();
		}
		ArrayList <Integer> al = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			int sum=1;
			for(int j=i;j<n;j++)
			{
				sum *=a[j];
			}
			al.add(sum);
			
		}
		Collections.sort(al);
		System.out.print(al.get(al.size()-1));
		

	}

}
