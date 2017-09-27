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
		
		String a = fruitName.toLowerCase();
		String s = a.substring(0, 1).toUpperCase() + a.substring(1);
		
		fruits.remove(s);
		fruits.trimToSize();
		
	}
	
	public String get(int i) { //No bugs found here but i had to add this method in order to
		return fruits.get(i);  //compare two ArrayLists.
	}
	
	public int size() {
		return fruits.size();
	}
	
	public void printAll() {
		for (int i=0; i<fruits.size(); i++) {
			System.out.println("fruits[" + i + "] = \"" + fruits.get(i) + "\"");
		}
	}
}


