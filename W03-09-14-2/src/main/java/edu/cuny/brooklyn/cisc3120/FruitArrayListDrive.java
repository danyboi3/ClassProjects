package edu.cuny.brooklyn.cisc3120;

public class FruitArrayListDrive {
	public static void main(String[] args) {
		/* TODO: you are required to implement the 'delete' method in the
		 *       FruitArrayList class. The output of this program upon your
		 *       completion of your program must be as follows,
		 *       
				Showing fruits in the ArrayList:
				fruits[0] = "Apple"
				fruits[1] = "Banana"
				fruits[2] = "Mango"
				Showing fruits after deleting 'Banana' 
				fruits[0] = "Apple"
				fruits[1] = "Mango"
				--------------------------------
				Showing fruits in the ArrayList:
				fruits[0] = "Apple"
				fruits[1] = "Banana"
				fruits[2] = "Mango"
				Showing fruits after deleting 'Mango' 
				fruits[0] = "Apple"
				fruits[1] = "Banana"
				--------------------------------
		 */
		
		/*
		 * TODO: answer the question in a comment. What do you need to make the 
		 *       'delete' method case-insensitive in the FruitArrayList class? 
		 *       You don't need to implement your solution; however, you are
		 *       required to provide at least two solutions, and argue which
		 *       solution is better, and why? 
		 *       
		 *       
		 *       One solution is to add an if statement and capitalize first letter, for example
		 *       String s = fruitName.substring(0, 1).toUpperCase() + fruitName.substring(1);
		 *       if (fruitName == s){
		 *       fruits.remove(fruitName);
		 *       }
		 *       else
		 *       	System.out.println("Capitalize First letter");
		 *       
		 *       Another solution is
		 *       if (fruits.toLowerCase(fruitName) == fruitName){
		 *       fruits.remove(fruitName);
		 *       }
		 *       else 
		 *       	System.out.println("All inputs have to be lower case");
		 *       
		 *       I believe the first solution is better because we check if if the first letter
		 *       of the word is capitalized by checking it. If it is not then it send back an 
		 *       error message
		 *       
		 */
		
		// Test Case 1
		testDeleteMiddle();
		// Tests Case 2
		testDeleteLast();
	}
	
	private static void testDeleteMiddle() {
		FruitArrayList fruits = new FruitArrayList();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		
		System.out.println("Showing fruits in the ArrayList:");
		fruits.printAll();
		/* note that upper-case 'B' in 'Banana' is intentional. */ 
		System.out.println("Showing fruits after deleting 'Banana' ");
		fruits.delete("Banana");
		fruits.printAll();
		System.out.println("--------------------------------");			
	}
	
	private static void testDeleteLast() {
		FruitArrayList fruits = new FruitArrayList();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		
		System.out.println("Showing fruits in the ArrayList:");
		fruits.printAll();
		System.out.println("Showing fruits after deleting 'Mango' ");
		fruits.delete("Mango");
		fruits.printAll();
		System.out.println("--------------------------------");			
	}	

}
