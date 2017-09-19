package edu.cuny.brooklyn.cisc3120;

public class FruitArray 
{
	private String[] fruits;
	private int size;		// number of fruits stored
	private int capacity;	// maximum number of fruits allowed
	
	public FruitArray(int capacity) {
		fruits = new String[capacity];
		this.capacity = capacity;
		size = 0;
	}
	
	public boolean add(String fruitName) {
		if (size >= capacity) return false;
		
		fruits[size] = fruitName;
		size ++;
		
		return true;
	}
	
	public void delete(String fruitName) {
		// TODO: 1. implement this method.
		/* TODO: 2. you may need to consult Java API documentation for the String class. 
		 *          Write a comment in the code, the method of the String class you
		 *          look up and the URL to the documentation the method 
		 */
		
		String s = fruitName.substring(0, 1).toUpperCase() + fruitName.substring(1);
		
		int index = -1;
		
		for(int i = 0; i < fruits.length; i++) {
			
			if(fruits[i].equals(s)) {
				index = i;
			}//end if statement
		}//end for loop
		
		for(int j = 0, k = 0; j < fruits.length; j++, k++) {
			fruits[k] = fruits[j];
			if (j == index) {
				k--;
			}//end if statement
		}//end for loop
		
		size--;
		
	}
	/*i looked up a delete and remove method from the String class but i could 
	 * not find it because they do not exist. So i shifted the elements one step back, 
	 * replacing the element that was supposed to be deleted. How ever i did use the substring
	 * and toUpperCase methods so i could capitalize "banana".
	 * 
	 * https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#substring(int)
	 * https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#toUpperCase()
	 * https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#substring(int,%20int)
	 * 
	 * I also used this for help:
	 * https://stackoverflow.com/questions/5725892/how-to-capitalize-the-first-letter-of-word-in-a-string-using-java
	 */
	
	public void printAll() {
		for (int i=0; i<size; i++) {
			System.out.println("fruits[" + i + "] = \"" + fruits[i] + "\"");
		}
	}
}
