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
Given a non-empty string and an int N, return the string 
made starting with char 0, and then every Nth char of the string. 
So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.


everyNth("Miracle", 2) → "Mrce"
everyNth("abcdefg", 2) → "aceg"
everyNth("abcdefg", 3) → "adg"
*/

public class everyNth{
	
	@Test
	public void Test1()
	{
		/*Test 1*/
		System.out.println("**********Test 1**********");
		System.out.println("Calculate everyNth(\"Miracle\", 2)\n");
		assertEquals("everyNth(\"Miracle\", 2) = \"Mrce\"", "Mrce", everyNth("Miracle", 2));
	}
	
	@Test
	public void Test2()
	{
		/*Test 2*/
		System.out.println("**********Test 2**********");
		System.out.println("Calculate everyNth(\"abcdefg\", 2)\n");
		assertEquals("everyNth(\"abcdefg\", 2) = \"aceg\"", "aceg", everyNth("abcdefg", 2));
	}
	
	@Test
	public void Test3()
	{
		/*Test 3*/
		System.out.println("**********Test 3**********");
		System.out.println("Calculate everyNth(\"abcdefg\", 3)\n");
		assertEquals("everyNth(\"abcdefg\", 3) = \"adg\"", "adg", everyNth("abcdefg", 3));
	}
	
	/*****************************************/
	public String everyNth(String str, int n) {
		  
		int x = 0;
		int z = 0;
		char array[] = new char[str.length()];
		
		while (x < str.length()) 
		{
			array[z] = str.charAt(x);
			x = x+n;
			z++;				
		}
			
		
		
		array[z] = '\n';
		System.out.println(array.toString());
		return array.toString();		
	}
}	




