package list;
import java.util.*;
public class Circular2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = s.nextInt();
		}
		int k = s.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=k;i<n;i++)
			al.add(a[i]);
		for(int i=0;i<k;i++)
			al.add(a[i]);
		System.out.println(al);

}
}
