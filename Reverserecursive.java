package Vegeta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverserecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> dragon = new  ArrayList<String>();
		dragon.add("goku");
		dragon.add("vegeta");
		dragon.add("gohan");
		System.out.println("Original order of List: " + dragon); 
		 Collections.reverse(dragon); 
		 System.out.println("The reversed List: " + dragon); 
         List<String> output = reverseListRecursively(dragon);
         System.out.println("Reversed list reversed again: " + output); 
         }
       private static List<String> reverseListRecursively(List<String> list) 
       { 
    	   if (list.size() <= 1) 
    	   { return list; } 
    	   ArrayList<String> reversed = new ArrayList<>(); 
    	   reversed.add(list.get(list.size() - 1)); 
    	   
    	     reversed.addAll(reverseListRecursively(list.subList(0, list.size() - 1))); 
    	     return reversed;

		

	}

}
