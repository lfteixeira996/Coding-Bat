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
Given a string, return a new string made of 3 copies of the 
first 2 chars of the original string. The string may be any length. 
If there are fewer than 2 chars, use whatever is there.


extraFront("Hello") --> "HeHeHe"
extraFront("ab") --> "ababab"
extraFront("H") --> "HHH"

 */
public class extraFront {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("extraFront(\"Hello\") --> \"HeHeHe\"\n");
		assertEquals("extraFront(\"Hello\") --> \"HeHeHe\"", "HeHeHe", extraFront("Hello"));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("extraFront(\"ab\") --> \"ababab\"\n");
		assertEquals("extraFront(\"ab\") --> \"ababab\"", "ababab", extraFront("ab"));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("extraFront(\"H\") --> \"HHH\"\n");
		assertEquals("extraFront(\"H\") --> \"HHH\"", "HHH", extraFront("H"));
		i++;
	}

	
	public String extraFront(String str) {
		 
		if (str.length() == 0) {
			return str;
		}
		
		else if (str.length()>=2) {
			return str.substring(0, 2)+str.substring(0, 2)+str.substring(0, 2);
		}
		
		else {
			return str.substring(0, 1)+str.substring(0, 1)+str.substring(0, 1);
		}	
	}

}
