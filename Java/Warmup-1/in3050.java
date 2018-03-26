package test;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * 
Given 2 int values, return true if they are both in
the range 30..40 inclusive, or they are both in the range 40..50 inclusive.


in3050(30, 31) → true
in3050(30, 41) → false
in3050(40, 50) → true
 */
public class in3050 {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("in3050(30, 31) → true\n");
		assertEquals("in3050(30, 31) → true", true, in3050(30, 31));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("in3050(30, 41) → false\n");
		assertEquals("in3050(30, 41) → false", false, in3050(30, 41));
		i++;
	}
		
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("in3050(40, 50) → true\n");
		assertEquals("in3050(40, 50) → true", true, in3050(40, 50));
		i++;
	}
		
	public boolean in3050(int a, int b) {
		  
		if ((a>=30 && a<=40) && (b>=30 && b<=40)) {
			return true;
		}
		
		else if ((a>=40 && a<=50) && (b>=40 && b<=50)) {
			return true;
		}
		
		else {
			return false;
		}
	}


}
