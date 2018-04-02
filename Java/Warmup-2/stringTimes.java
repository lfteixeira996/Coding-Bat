/**
 * @author Luis Teixeira
 *
 * @date   28/03/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Warmup_2;

import static org.junit.Assert.*;

import org.junit.Test;


/**
Given a string and a non-negative int n, return a larger string that is n copies of the original string.

stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
*/

public class stringTimes {

	@Test
	public void Test1()
	{
		/*Test 1*/
		System.out.println("**********Test 1**********");
		System.out.println("stringTimes(\"Hi\", 2) → \"HiHi\"\n");
		assertEquals("stringTimes(\"Hi\", 2) → \"HiHi\"", "HiHi", stringTimes("Hi", 2));
	}
	
	@Test
	public void Test2()
	{
		/*Test 1*/
		System.out.println("**********Test 1**********");
		System.out.println("stringTimes(\"Hi\", 3) → \"HiHiHi\"\n");
		assertEquals("stringTimes(\"Hi\", 3) → \"HiHiHi\"", "HiHiHi", stringTimes("Hi", 3));
	}
	
	@Test
	public void Test3()
	{
		/*Test 1*/
		System.out.println("**********Test 1**********");
		System.out.println("stringTimes(\"Hi\", 1) → \"Hi\"\n");
		assertEquals("stringTimes(\"Hi\", 1) → \"Hi\"", "Hi", stringTimes("Hi", 1));
	}
	
	public String stringTimes(String str, int n) {
		  
		String ret ="";
		
		for (int i = 0; i < n; i++) {
			ret += str;
		}
		
		return ret;
	}

}
