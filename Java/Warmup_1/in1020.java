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
 
Given 2 int values, return true if either of them is in the range 10..20 inclusive.


in1020(12, 99) --> true
in1020(21, 12) --> true
in1020(8, 99) --> false

 */
public class in1020 {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("in1020(12, 99) --> true\n");
		assertEquals("in1020(12, 99) --> true", true, in1020(12, 99));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("in1020(21, 12) --> true\n");
		assertEquals("in1020(21, 12) --> true", true, in1020(21, 12));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("in1020(8, 99) --> false\n");
		assertEquals("in1020(8, 99) --> false", false, in1020(8, 99));
		i++;
	}
	
	public boolean in1020(int a, int b) {
		  
		if ((a>=10 && a<=20) || (b>=10 && b<=20)) {
			return true;
		}	
		
		return false;
	}
}
