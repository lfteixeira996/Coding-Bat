/**
 * @author Luis Teixeira
 *
 * @date   28/03/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Warmup_1;

import static org.junit.Assert.*;

import org.junit.Test;

/*
We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
Given 2 int values, return true if one or the other is teen, but not both.


loneTeen(13, 99) --> true
loneTeen(21, 19) --> true
loneTeen(13, 13) --> false
 */
public class loneTeen {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("loneTeen(13, 99)\n");
		assertEquals("loneTeen(13, 99) --> true", true, loneTeen(13, 99));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("loneTeen(21, 19) --> true\n");
		assertEquals("loneTeen(21, 19) --> true", true, loneTeen(21, 19));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("loneTeen(13, 13) --> false\n");
		assertEquals("loneTeen(13, 13) --> false", false, loneTeen(13, 13));
		i++;
	}
	
	

	public boolean loneTeen(int a, int b) {
		 
		if ((a>=13 && a<=19) && (b>=13 && b<=19)) {
			return false;
		}
		
		else if ((a>=13 && a<=19)) {
			return true;
		}
		
		else if ((b>=13 && b<=19)) {
			return true;
		}
		
		else {
			return false;
		}
	}

}
