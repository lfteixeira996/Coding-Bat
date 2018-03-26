package test;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * 
Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
Use the % "mod" operator -- see Introduction to Mod


or35(3) → true
or35(10) → true
or35(8) → false
 */
public class or35 {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("or35(3) → true\n");
		assertEquals("or35(3) → true", true, or35(3));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("or35(10) → true\n");
		assertEquals("or35(10) → true", true, or35(3));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("or35(8) → false\n");
		assertEquals("or35(8) → false", false, or35(8));
		i++;
	}

	public boolean or35(int n) {
		  
		if (n%3 == 0 || n%5 == 0) {
			return true;
		}
		
		else {
			return false;
		}
	}

}
