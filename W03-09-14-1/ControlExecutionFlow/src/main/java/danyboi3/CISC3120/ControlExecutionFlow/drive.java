package danyboi3.CISC3120.ControlExecutionFlow;

import java.util.Random;

public class drive 
{
    public static void main( String[] args )
    {
    	Stars stars = new Stars();
    	Check check = new Check();
        Random rand = new Random();
        
        for (int k = 0; k <=50; k++) {  
        	
            int a = rand.nextInt(50);
            int b = rand.nextInt(50);
        	check.flow(a, b);
        	stars.divide();
        	
        }
        
    }
}
