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
 
Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
or return 0 if neither is in that range.


max1020(11, 19) --> 19
max1020(19, 11) --> 19
max1020(11, 9) --> 11
 */
public class max1020 {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("max1020(11, 19) --> 19\n");
		assertEquals("max1020(11, 19) --> 19", 19, max1020(11, 19));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("max1020(19, 11) --> 19\n");
		assertEquals("max1020(19, 11) --> 19", 19, max1020(19, 11));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("max1020(11, 9) --> 11\n");
		assertEquals("max1020(11, 9) --> 11", 11, max1020(11, 9));
		i++;
	}
	
	
	public int max1020(int a, int b) {
		
		if ((a>=10 && a<=20) || (b>=10 && b<=20)) {
			
			if (a>=b && a<=20) {
				return a;
			}
			
			else if (b>=a && b<=20) {
				return b;
			}
		}
		
		return 0;
	}
}
