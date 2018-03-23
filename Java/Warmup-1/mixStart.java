package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
Return true if the given string begins with "mix", 
except the 'm' can be anything, so "pix", "9ix" .. all count.

mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false
*/

public class mixStart{
	
	@Test
	public void Test1()
	{
		/*Test 1*/
		System.out.println("**********Test 1**********");
		boolean actual = mixStart("mix snacks");
		System.out.println("Calculate mixStart(\"mix snacks\")\n");
		assertEquals("mixStart(\"mix snacks\") = true", true, mixStart("mix snacks"));
	}
	
	@Test
	public void Test2()
	{
		/*Test 2*/
		System.out.println("**********Test 2**********");
		boolean actual = mixStart("pix snacks");
		System.out.println("Calculate mixStart(\"pix snacks\")\n");
		assertEquals("mixStart(\"pix snacks\") = true", true, mixStart("pix snacks"));
	}

	@Test
	public void Test3()
	{
		/*Test 2*/
		System.out.println("**********Test 3**********");
		boolean actual = mixStart("piz snacks");
		System.out.println("Calculate mixStart(\"piz snacks\")\n");
		assertEquals("mixStart(\"piz snacks\") = false", false, mixStart("piz snacks"));
	}
	
	/***********************************/
	public boolean mixStart(String str) {
		  
		if(str.length() < 3)
		{
			return false;
		}
		
		if (str.charAt(1) == 'i' && str.charAt(2) == 'x') {
			return true;			
		}
		
		return false;
	}


}	