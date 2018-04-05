/**
 * @author Luis Teixeira
 *
 * @date   05/04/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package AP_1;

import static org.junit.Assert.*;

import org.junit.Test;

/**

Given a positive int n, return true if it contains a 1 digit. Note: use % to get the rightmost digit, and / to discard the rightmost digit.


hasOne(10) → true
hasOne(22) → false
hasOne(220) → false
 */
public class hasOne {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("hasOne(10) → true\n");		
		assertEquals("hasOne(10) → true", true, hasOne(10));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("hasOne(22) → false\n");		
		assertEquals("hasOne(22) → false", false, hasOne(22));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("hasOne(220) → false\n");		
		assertEquals("hasOne(220) → false", false, hasOne(220));
		i++;
	}

	public boolean hasOne(int n) {
		  
		
	}
}
