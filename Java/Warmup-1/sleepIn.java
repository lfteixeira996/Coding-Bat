/**
 * @author Luis Teixeira
 *
 * @date   28/03/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Warmup_1;
import static org.junit.Assert.assertEquals;

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
	public void Test1()
	{
		/*Test 1*/
		System.out.println("**********Test 1**********");
		boolean actual = sleepIn(false, false);
		System.out.println("Calculate sleepIn(false, false)\n");	
		assertEquals("sleepIn(false, false) = true", true, actual);
	}

	@Test
	public void Test2()
	{
		/*Test 2*/
		System.out.println("**********Test 2**********");
		boolean actual = sleepIn(true, false);
		System.out.println("Calculate sleepIn(true, false)\n");	
		assertEquals("sleepIn(true, false) = false", false, actual);
	}
	
	@Test
	public void Test3()
	{
		/*Test 3*/
		System.out.println("**********Test 3**********");
		boolean actual = sleepIn(false, true);
		System.out.println("Calculate sleepIn(false, true)\n");	
		assertEquals("sleepIn(false, true) = true", true, actual);
	}
	
	
	/*********************************************************/
	public boolean sleepIn(boolean weekday, boolean vacation) {
		
		if (weekday==false )
			return true;
			
		else if (weekday==true && vacation==true)
			return true;
		
		return false;	  
	}

}



