/**
 * @author 	Luis Teixeira
 *
 * @data 	4 Jun 2018
 *
 * @mail	filipe.teixeira.996@gmail.com 
 */
package Warmup_2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/* 
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true

*/
public class doubleX {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("doubleX(\"axxbb\") → true\n");    
	    assertEquals(true, doubleX("axxbb"));
	    i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("doubleX(\"axaxax\") → false\n");    
	    assertEquals(false, doubleX("axaxax"));
	    i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("doubleX(\"xxxxx\") → true\n");    
	    assertEquals(true, doubleX("xxxxx"));
	    i++;
	}
	
	
	boolean doubleX(String str) {

		int first_occu = str.indexOf('x');
		
		if (str.length() <2) {
			return false;
		}
		
		
		if (str.charAt(first_occu+1) == 'x') {
			return true;
		}
		
		return false;
	}
}
