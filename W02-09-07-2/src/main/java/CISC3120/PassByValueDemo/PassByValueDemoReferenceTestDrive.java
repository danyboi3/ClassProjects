package CISC3120.PassByValueDemo;

public class PassByValueDemoReferenceTestDrive {
	public static void main(String[] args) {
		// TODO: 1. complete the class using the code in slide 6 of lecture C04
		/* TODO: 2. run the two Java programs, and observe the result, and explain the 
		 *          learning objective of this exercise the instructor has in mind. Write
		 *          the explanation as a comment in this program
		 */
	
		PassByValueDemoReference demo = new PassByValueDemoReference();
		
				int[] x = {3};
				
				System.out.println("main: before calling changeX: x[0] = " + x[0]);
				
				demo.changeX(x);
				
				System.out.println("main: after calling changeX: x[0] = " + x[0]);
				
				/*The possible learning objectives of this exercise are to make sure the code
				 * has a neat style for example proper indentation and spacing, also to fix
				 * syntax errors. Another thing we learn from this is how to open other peoples
				 * projects and add our own code to it and make it work. 
				 */
				
	}//end main
}//end PassByValueDemoReferenceTestDrive class

