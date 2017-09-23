package danyboi3.CISC3120.ControlExecutionFlow;

public class Check {
	
	public void flow (int i, int j) {
		
		System.out.println("i = " + i + " j = " + j);
		
		if (i == j) {
			System.out.println("Both are equal");
		}	else if (i < j) {
				System.out.println("i is less than j, making j greater");
			}
				else {
					System.out.println("j is less than i, making i greater");
				}//end of if else statement
		
	}//end of flow method
}//end of Check class
