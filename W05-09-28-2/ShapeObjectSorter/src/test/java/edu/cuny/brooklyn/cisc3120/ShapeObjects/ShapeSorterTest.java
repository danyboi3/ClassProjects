package edu.cuny.brooklyn.cisc3120.ShapeObjects;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShapeSorterTest {
	@Test
	public void testShapeSorterByName() {
		ArrayList<Shape> shapeList = new ArrayList<Shape>();
		shapeList.add(new Circle("C123456789", 10.));
		shapeList.add(new Circle("C12345678", 8.));
		shapeList.add(new Circle("C1234567890", 11.));
		shapeList.add(new Rectangle("C12", 10., 80.));
		
		ArrayList<Shape> expectedShapeList = new ArrayList<Shape>();
		expectedShapeList.add(new Rectangle("C12", 10., 80.));
		expectedShapeList.add(new Circle("C12345678", 8.));
		expectedShapeList.add(new Circle("C123456789", 10.));
		expectedShapeList.add(new Circle("C1234567890", 11.));
		
		shapeList.sort(new ShapeNameComparator());
		assertEquals(expectedShapeList, shapeList);
		
	}
	
	//Test for Area
	@Test
	public void testShapeSorterByArea() {
		ArrayList<Shape> shapeList = new ArrayList<Shape>();
		shapeList.add(new Circle("C123456789", 10.)); //314.1592653
		shapeList.add(new Circle("C12345678", 8.)); //201.0619298
		shapeList.add(new Circle("C1234567890", 11.)); //380.1327110
		shapeList.add(new Rectangle("C12", 10., 80.)); //800
		
		ArrayList<Shape> expectedShapeList = new ArrayList<Shape>();
		expectedShapeList.add(new Circle("C12345678", 8.)); //201.0619298
		expectedShapeList.add(new Circle("C123456789", 10.)); //314.1592653
		expectedShapeList.add(new Circle("C1234567890", 11.)); //380.1327110
		expectedShapeList.add(new Rectangle("C12", 10., 80.)); //800
		
		shapeList.sort(new ShapeAreaComparator());
		assertEquals(expectedShapeList, shapeList);
		
	}
}
   