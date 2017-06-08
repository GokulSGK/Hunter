import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class Conlarge {

	public static void main(String[] args) {
		
		
		 Scanner s = new Scanner(System.in);
		 System.out.print("size:");
		 int u = s.nextInt();
		 int a[] = new int[u];
		 for(int i=0;i<5;i++)
			{
				a[i] = s.nextInt();
				
			}
		
		Arrays.sort(a);
		
		
		ArrayList<Integer> alist= new ArrayList<Integer>();
		
		
		alist.add(a[0]);
		alist.add(a[1]);
		alist.add(a[2]);
		alist.add(a[3]);
		alist.add(a[4]);
		
		Collections.sort(alist, Collections.reverseOrder());
		 int[] ret = new int[alist.size()];
		    for (int i=0; i < ret.length; i++)
		    {
		        ret[i] = alist.get(i).intValue();
		        System.out.print(ret[i]);
		    }
		    String sg = Arrays.toString(ret);
		    System.out.println("");
		    System.out.println("Order of #'s"+sg);
		 
		    
	

	}

}
