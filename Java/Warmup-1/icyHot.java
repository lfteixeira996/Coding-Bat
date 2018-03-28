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
Given two temperatures, return true if one is less than 0 and the other is greater than 100.


icyHot(120, -1) → true
icyHot(-1, 120) → true
icyHot(2, 120) → false
 */
public class icyHot {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("icyHot(120, -1) → true\n");
		assertEquals("icyHot(120, -1) → true", true, icyHot(120, -1));
		i++;
	}
	
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("icyHot(-1, 120) → true\n");
		assertEquals("icyHot(-1, 120) → true", true, icyHot(-1, 120));
		i++;
	}
	
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("icyHot(2, 120) → false\n");
		assertEquals("icyHot(2, 120) → false", false, icyHot(2, 120));
		i++;
	}
	
	
	
	public boolean icyHot(int temp1, int temp2) {
		  
		if (temp1<0 && temp2>100) {
			return true;			
		}
		
		else if (temp2<0 && temp1>100) {
			return true;
		}
		
		else {
			return false;
		}
	}

}
