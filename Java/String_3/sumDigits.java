/**
 * @author Luis Teixeira
 *
 * @date   02/04/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package String_3;

import static org.junit.Assert.*;

import org.junit.Test;

/**

Given a string, return the sum of the digits 0-9 that appear in the string, 
ignoring all other characters. Return 0 if there are no digits in the string. 
(Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)


sumDigits("aa1bc2d3") --> 6
sumDigits("aa11b33") --> 8
sumDigits("Chocolate") --> 0
 */
public class sumDigits {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("sumDigits(\"aa1bc2d3\") --> 6\n");
		assertEquals("sumDigits(\"aa1bc2d3\") --> 6", 6, sumDigits("aa1bc2d3"));
		i++;
	}

	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("sumDigits(\"aa11b33\") --> 8\n");
		assertEquals("sumDigits(\"aa11b33\") --> 8", 8, sumDigits("aa11b33"));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("sumDigits(\"Chocolate\") --> 0\n");
		assertEquals("sumDigits(\"Chocolate\") --> 0", 0, sumDigits("Chocolate"));
		i++;
	}
	
	
	
	public int sumDigits(String str) {
		
		int sum = 0;
		
		for (int i = 0; i < str.length(); i++) {			
			if (Character.isDigit(str.charAt(i))) {
				sum += Character.getNumericValue(str.charAt(i));
			}
		}
		
		return sum;
	}

}
