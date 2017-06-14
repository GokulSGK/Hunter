package hunter;

import java.util.Scanner;

public class Fo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENTER THE STRING 1");
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		System.out.println("ENTER THE STRING 2");
		String s2=s.nextLine();
		if(s1.indexOf(s2)>=0)
		{
			System.out.print(s1.indexOf(s1));
		}
		else
		{
			System.out.print("1");
		}

	}

}
