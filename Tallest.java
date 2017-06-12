import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("No. of person's height entered");
		int n = s.nextInt();
		ArrayList <Integer> s1 = new ArrayList<Integer>();
		for(int i = 0;i<n;i++ )
		{
			int s2 = s.nextInt();
			s1.add(s2);
		}
		Collections.sort(s1,Collections.reverseOrder());
		System.out.println("enter k value");
		int k = s.nextInt();
		int g = s1.get(k-1);
		System.out.println(g);

	}

}
