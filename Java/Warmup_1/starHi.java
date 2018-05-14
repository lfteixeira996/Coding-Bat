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
 
Given a string, return true if the string starts with "hi" and false otherwise.


startHi("hi there") --> true
startHi("hi") --> true
startHi("hello hi") --> false

 */





public class starHi{
	
	@Test
	public void Test1()
	{
		/*Test 1*/
		System.out.println("**********Test 1**********");
		boolean actual = startHi("hi there");
		System.out.println("Calculate startHi(\"hi there\")\n");
		assertEquals("startHi(\"hi there\") = true", true, startHi("hi there"));
	}
	
	@Test
	public void Test2()
	{
		/*Test 2*/
		System.out.println("**********Test 2**********");
		boolean actual = startHi("hi");
		System.out.println("Calculate startHi(\"hi\")\n");
		assertEquals("startHi(\"hi\") = true", true, startHi("hi"));
	}
	
	@Test
	public void Test3()
	{
		/*Test 3*/
		System.out.println("**********Test 3**********");
		boolean actual = startHi("hello hi");
		System.out.println("Calculate startHi(\"hello hi\")\n");
		assertEquals("startHi(\"hello hi\") = false", false, startHi("hello hi"));
	}
	
	/*********************************************************/
	public boolean startHi(String str) {
		  
		if(str.length() < 2)
		{
			return false;
		}
		
		String aux = str.substring(0, 2);
		
		return str.startsWith("hi");
		
	}
}