/**
 * @author Luis Teixeira
 *
 * @date   28/03/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Warmup_1;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * 
We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. 
We are in trouble if the parrot is talking and the hour is before 7 or after 20. 
Return true if we are in trouble.


parrotTrouble(true, 6) → true
parrotTrouble(true, 7) → false
parrotTrouble(false, 6) → false
 */
public class parrotTrouble {

	int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("parrotTrouble(true, 6) → true\n");
		assertEquals("parrotTrouble(true, 6) → true", true, parrotTrouble(true, 6));
		i++;
	}

	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("parrotTrouble(true, 7) → false\n");
		assertEquals("parrotTrouble(true, 7) → false", false, parrotTrouble(true, 7));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("parrotTrouble(false, 6) → false\n");
		assertEquals("parrotTrouble(false, 6) → false", false, parrotTrouble(false, 6));
		i++;
	}
	
	public boolean parrotTrouble(boolean talking, int hour) {
		  
		if ((talking == true)&&(hour <7) || (talking == true)&&(hour>20)  ) {
			return true;
		}
		
		else {
			return false;
		}
	}

}
