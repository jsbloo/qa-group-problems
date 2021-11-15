package tasks.from.git;

import java.util.ArrayList;

public class ArrayTaskMiki {

	public static void main(String[] args) {

		 ArrayList<String> words = new ArrayList<String>() {{
		        add("bib");
		        add("no");
		        add("ok");
		        add("racecar");
		        add("winner");
		        add("chicken");
		        add("robot1");
		        add("ok");
		        add("kebab");
		        add("nun");
		        add("madam");
		        add("java");
		        add("computer");
		        add("civic");
		        add("spitfire");
		        add("coffee");
		        add("hannah");
		        add("deified");
		        add("sword");
		        add("pilgrim");
		        add("level");
		    }};
//		    System.out.println("This is full list: " + words);
		   
		    
		    for (String item : words) {
		    	  StringBuilder backwards = new StringBuilder(item);
		    	  backwards=backwards.reverse();
		          String sbToString = backwards.toString();
		    			  if (item.equals(sbToString)) {
						System.out.println(backwards.reverse());
		    			  
		    			  }		    			  
						
				
				}

	
			
		    
		    
		    
		    
//		    Your task, is to create a method that takes in an ArrayList as a parameter
//		    and returns a new ArrayList that contains all the palindromes
//		    contained within the given ArrayList.
//
//		    There are many different ways to complete this problem!
	}

}
