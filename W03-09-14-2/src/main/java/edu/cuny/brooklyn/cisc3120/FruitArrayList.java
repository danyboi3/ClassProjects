package edu.cuny.brooklyn.cisc3120;

import java.util.ArrayList;

/*
 * Wrapper for ArrayList 
 */
public class FruitArrayList {
	ArrayList<String> fruits;
	
	public FruitArrayList() {
		fruits = new ArrayList<String>();
	}
	
	
	public void add(String fruitName) {
		fruits.add(fruitName);
	}
	
	public void delete(String fruitName) {
		// TODO: 1. implement this method.
		/* TODO: 2. you may need to consult Java API documentation for the ArrayList class. 
		 *          Write a comment in the code, the method of the ArrayList class you
		 *          look up and the URL to the documentation the method 
		 */
		
		fruits.remove(fruitName);
		fruits.trimToSize();
	}
	/*i looked up delete or remove method and i found a remove method that does
	 *what i wanted to do which is to remove an element from the ArrayList.
	 *https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html#remove(java.lang.Object)
	 *
	 *then i wanted to remove extra size that the List holds so i used trimToSize method
	 *https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html#trimToSize()
	 */
	
	public void printAll() {
		for (int i=0; i<fruits.size(); i++) {
			System.out.println("fruits[" + i + "] = \"" + fruits.get(i) + "\"");
		}
	}
}
