/**
 * @author Luis Teixeira
 *
 * @date   28/03/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package String_1;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * 
Given a string, return a string length 1 from its front, 
unless front is false, in which case return a string
length 1 from its back. The string will be non-empty.


theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
theEnd("oh", true) → "o"

 */
public class theEnd {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("theEnd(\"Hello\", true) → \"H\"\n");
		assertEquals("theEnd(\"Hello\", true) → \"H\"", "H", theEnd("Hello", true));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("theEnd(\"Hello\", false) → \"o\"\n");
		assertEquals("theEnd(\"Hello\", false) → \"o\"", "o", theEnd("Hello", false));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("theEnd(\"oh\", true) → \"o\"\n");
		assertEquals("theEnd(\"oh\", true) → \"o\"", "o", theEnd("oh", true));
		i++;
	}
	

	public String theEnd(String str, boolean front) {
		  
		StringBuilder sb = new StringBuilder();
		
		if (front) {
			sb.append(str.charAt(0));
			return sb.toString();
		}
		
		else {
			sb.append(str.charAt(str.length()-1));
			return sb.toString();
		}
	}

}
