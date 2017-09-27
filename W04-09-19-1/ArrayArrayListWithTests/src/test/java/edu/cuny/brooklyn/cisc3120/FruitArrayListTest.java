package edu.cuny.brooklyn.cisc3120;

import org.junit.Test;

import static org.junit.Assert.*;

public class FruitArrayListTest {
	
	@Test
	public void TestDeleteListMiddle() {
		
		FruitArrayList fruits = new FruitArrayList();
		
		System.out.println("Delete Kiwi from Middle Test \n ***Fruits***");
		
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Kiwi");
		fruits.add("Watermelon");
		fruits.add("Orange");
		
		fruits.printAll();
		
		FruitArrayList fruitsExpected = new FruitArrayList();
		
		System.out.println("***Fruits Expected***");
		
		fruitsExpected.add("Mango");
		fruitsExpected.add("Apple");
		fruitsExpected.add("Watermelon");
		fruitsExpected.add("Orange");
		
		fruitsExpected.printAll();
		
		fruits.delete("Kiwi");
		
		System.out.println("***Fruits after deleting Kiwi***");
		fruits.printAll();
		
		for(int i = 0; i < fruits.size(); i++) {
		assertEquals(fruitsExpected.get(i), fruits.get(i));
		}
		
		System.out.println(""); //new line
		
	}//end TestDeleteListMiddle() method
	
	@Test
	public void TestDeleteListFirst() {
		
		FruitArrayList fruits = new FruitArrayList();
		
		System.out.println("Delete Mango from beginning Test \n ***Fruits***");
		
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Kiwi");
		fruits.add("Watermelon");
		fruits.add("Orange");
		
		fruits.printAll();
		
		FruitArrayList fruitsExpected = new FruitArrayList();
		
		System.out.println("***Fruits Expected***");
		
		fruitsExpected.add("Apple");
		fruitsExpected.add("Kiwi");
		fruitsExpected.add("Watermelon");
		fruitsExpected.add("Orange");
		
		fruitsExpected.printAll();
		
		fruits.delete("Mango");
		
		System.out.println("***Fruits after deleting Mango***");
		fruits.printAll();
		
		for(int i = 0; i < fruits.size(); i++) {
		assertEquals(fruitsExpected.get(i), fruits.get(i));
		}
		
		System.out.println(""); //new line
		
	}//end TestDeleteListFirst() method
	
	@Test
	public void TestDeleteListLast() {
		
		FruitArrayList fruits = new FruitArrayList();
		
		System.out.println("Delete Orange from ending Test \n ***Fruits***");
		
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Kiwi");
		fruits.add("Watermelon");
		fruits.add("Orange");
		
		fruits.printAll();
		
		FruitArrayList fruitsExpected = new FruitArrayList();
		
		System.out.println("***Fruits Expected***");
		
		fruitsExpected.add("Mango");
		fruitsExpected.add("Apple");
		fruitsExpected.add("Kiwi");
		fruitsExpected.add("Watermelon");
		
		fruitsExpected.printAll();
		
		fruits.delete("Orange");
		
		System.out.println("***Fruits after deleting Orange***");
		fruits.printAll();
		
		for(int i = 0; i < fruits.size(); i++) {
		assertEquals(fruitsExpected.get(i), fruits.get(i));
		}
		
		System.out.println(""); //new line
		
	}//end TestDeleteListLast() method
	
	@Test
	public void TestDeleteListLastCaseSensitive() {
		
		FruitArrayList fruits = new FruitArrayList();
		
		System.out.println("Delete oranGe from ending CASE SENSITIVE TEST \n ***Fruits***");
		
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Kiwi");
		fruits.add("Watermelon");
		fruits.add("Orange");
		
		fruits.printAll();
		
		FruitArrayList fruitsExpected = new FruitArrayList();
		
		System.out.println("***Fruits Expected***");
		
		fruitsExpected.add("Mango");
		fruitsExpected.add("Apple");
		fruitsExpected.add("Kiwi");
		fruitsExpected.add("Watermelon");
		
		fruitsExpected.printAll();
		
		fruits.delete("oranGe");
		
		System.out.println("***Fruits after deleting oranGe***");
		fruits.printAll();
		
		for(int i = 0; i < fruits.size(); i++) {
		assertEquals(fruitsExpected.get(i), fruits.get(i));
		}
		
		System.out.println(""); //new line
		
	}//end TestDeleteListLastCaseSensitive() method
	
	
	

}
