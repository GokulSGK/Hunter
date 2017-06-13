import java.util.HashSet;
import java.util.Scanner;

public class Removeduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		char c[] = s1.toCharArray();
		HashSet <Character> c1 = new HashSet<Character>();
		for(int i=0;i<s1.length();i++)
		{
			c1.add(c[i]);
		}
		for(Character s3 : c1)
		{
			System.out.print(s3);
		}

	}
  }
