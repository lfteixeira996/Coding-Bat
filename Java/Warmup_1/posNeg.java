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
 * 
Given 2 int values, return true if one is negative and one is positive. 
Except if the parameter "negative" is true, then return true only if both are negative.


posNeg(1, -1, false) --> true
posNeg(-1, 1, false) --> true
posNeg(-4, -5, true) --> true
 */
public class posNeg {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("posNeg(1, -1, false) --> true\n");
		assertEquals("posNeg(1, -1, false) --> true", true, posNeg(1, -1, false));
		i++;
	}

	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("posNeg(-1, 1, false) --> true\n");
		assertEquals("posNeg(-1, 1, false) --> true", true, posNeg(-1, 1, false));
		i++;
	}	
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("posNeg(-4, -5, true) --> true\n");
		assertEquals("posNeg(-4, -5, true) --> true", true, posNeg(-4, -5, true));
		i++;
	}
	
	
	
	
	public boolean posNeg(int a, int b, boolean negative) {

		if ((negative==true && a<0 && b<0)) {
			return true;
		}
		
		if ((negative==false && a<0 && b>0) || (negative==false && a>0 && b<0)) {
			return true;
		}

		else {
			return false;
		}
	}

}
