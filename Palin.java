import java.util.LinkedList;
import java.util.Scanner;

public class Palin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		LinkedList<Character> ll=new LinkedList<Character>();
		String s1="";
		System.out.println("No. of characters");
		int n=s.nextInt();
		char[] a=new char[n];
		System.out.println("ENTER THE ELEMENTS");
		for(int i=0;i<n;i++)
		{
			a[i]=s.next().charAt(0);
			ll.add(a[i]);
		}
		for(char c:ll)
		{
			s1=s1.concat(String.valueOf(c));
		}
		StringBuffer sb=new StringBuffer(s1);
		if(s1.equals(new String(sb.reverse())))
		{
			System.out.println("PALINDROME");
		}
		else
		{
			System.out.println("NOT A PALINDROME");
		}

	}

}
