package test;
import org.junit.Test;

/*
The parameter weekday is true if it is a weekday, 
and the parameter vacation is true if we are on vacation. 
We sleep in if it is not a weekday or we're on vacation. 
Return true if we sleep in.


sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true
*/



public class sleepIn {

	@Test
	public void myTest()
	{
		/*Test 1*/
		System.out.println("**********Test 1**********");
		boolean actual = sleepIn(false, false);
		System.out.println("Calculate sleepIn(false, false)");
		System.out.println("Expected: "+ true);
		System.out.println("Received: "+ actual+'\n');
		
		/*Test 2*/
		System.out.println("**********Test 2**********");
		actual = sleepIn(true, false);
		System.out.println("Calculate sleepIn(true, false)");
		System.out.println("Expected: "+ false);
		System.out.println("Received: "+ actual+'\n');
		
		/*Test 3*/
		System.out.println("**********Test 3**********");
		actual = sleepIn(false, true);
		System.out.println("Calculate sleepIn(false, true)");
		System.out.println("Expected: "+ true);
		System.out.println("Received: "+ actual+'\n');			
	}

	public boolean sleepIn(boolean weekday, boolean vacation) {
		
		if (weekday==false )
			return true;
			
		else if (weekday==true && vacation==true)
			return true;
		
		return false;	  
	}

}



