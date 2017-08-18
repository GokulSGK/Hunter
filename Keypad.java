package list;
import java.util.*;

public class Keypad {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s5 = "";
		Map<String,Integer> al2 = new HashMap<String,Integer>();
		ArrayList<String> al = new ArrayList<String>();
		al.add("    ");
		al.add("    ");
		al.add(" ABC");
		al.add(" DEF");
		al.add(" GHI");
		al.add(" JKL");
		al.add(" MNO");
		al.add(" PQRS");
		al.add(" TUV");
		al.add(" WXYZ");
		String n = s.nextLine();
		
		for(String s2 : n.split(""))
		{
			int n2 = 0;
			if(!(s2.equals("*")))
			{
				for(String s3 : n.split(""))
				{
					if(s2.equalsIgnoreCase(s3))
					{
						n2++;
					}
				}
				n.replaceAll(s2, "*");
				al2.put(s2, n2);
			}
		}
		
		for(Map.Entry ma:al2.entrySet())
		{
			int n3 = Integer.parseInt((String) ma.getKey());
			String s4 = al.get(n3);
			if(!s4.equals("    "))
			s5 = s5+ String.valueOf(s4.charAt((int) ma.getValue()));
		}
		System.out.println(s5);
		int m = 1,n5 = s5.length();
		ArrayList <String> al4 = new ArrayList<String>();
		for(int i=1;i<=n5;i++)
			{m *= i;}
		int n3 = m/n5;
		for(int i=0;i<n5;i++)
		{
			int k=0;
			String c = String.valueOf(s5.charAt(i));
			char c1[] = new char[n5-1];
			for(int j=0;j<n5;j++)
			{
			if(i != j)
			{
				c1[k] = s5.charAt(j);
				k++;
			}
			}
			String s2 = new String(c1);
			int h=0,in=0,u=0,g=s2.length();
			char c2[] = new char[g];
			while(h<n3)
			{
				int f=0;
				for(int l=0;l<g;l++)
				{
					in =in+l;
					while(in>=g)
					{
						in =in-g;}
					c2[f] = s2.charAt(in);f++;in=u;
				}
				in = ++u;
				String s3 = c + new String(c2);
				al4.add(s3);
				h++;
			}
		}
		System.out.println(al4);

		

	}

}
