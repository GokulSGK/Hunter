import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Cardshuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("size");
		int n = s.nextInt();
		ArrayList <Integer> al = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			int m = s.nextInt();
			al.add(m);
		}
		Random j = new Random(3);
		Collections.shuffle(al, j);
		for(Integer o:al)
		{
			System.out.print(o+" ");
		}

	}

}
