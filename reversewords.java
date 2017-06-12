import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class reversewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("No. of strings");
		int n = s.nextInt();
		ArrayList <String> s1 = new ArrayList<String>();
		for(int i = 0;i<n;i++ )
		{
			String s2 = s.next();
			s1.add(s2);
		}
		Collections.reverse(s1);
		for(String g:s1)
		{
			System.out.println(g);
		}
	}

}
