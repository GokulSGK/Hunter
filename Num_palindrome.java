package hunter;
import java.util.*;
public class Num_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum1 = arms(n);
		String s1 = String.valueOf(sum1);
		StringBuffer s2 = new StringBuffer(s1);
		s2.reverse();
		String s3 = new String(s2);
		if(s1.equals(s3))
		{
			System.out.print("Sum is a Palindrome");
		}
		else
		{
			System.out.print("Sum is not a Palindrome");
		}

	}
	public static int arms(int n)
	{
		int sum = 0;
		while(n>0)
		{
			int t=n%10;
			sum=sum+t;
			n = n/10;
		}
		return sum;
	}

}
