/**
 * @author 	Luis Teixeira
 *
 * @data 	30 May 2018
 *
 * @mail	filipe.teixeira.996@gmail.com 
 */
package Warmup_1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*

Given a string, return a new string where the last 3 chars are now in upper case. 
If the string has less than 3 chars, uppercase whatever is there. 
Note that str.toUpperCase() returns the uppercase version of a string.


endUp("Hello") --> "HeLLO"
endUp("hi there") --> "hi thERE"
endUp("hi") --> "HI"
*/
public class endUp {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("endUp(\"Hello\") --> \"HeLLO\"\n");
		assertEquals("endUp(\"Hello\") --> \"HeLLO\"", "HeLLO", endUp("Hello"));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("endUp(\"hi there\") --> \"hi thERE\"\n");
		assertEquals("endUp(\"hi there\") --> \"hi thERE\"", "hi thERE", endUp("hi there"));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("endUp(\"hi\") --> \"HI\"\n");
		assertEquals("endUp(\"hi\") --> \"HI\"", "HI", endUp("hi"));
		i++;
	}
		
	public String endUp(String str) {
		  
		if (str.length()<3) {
			return str.toUpperCase();
		}
		
		String sub = str.substring(str.length()-3, str.length());
		
		return str.substring(0, str.length()-3)+sub.toUpperCase();
	}
}
