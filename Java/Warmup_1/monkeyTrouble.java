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
We have two monkeys, a and b, and the parameters aSmile and bSmile 
indicate if each is smiling. We are in trouble if they are both 
smiling or if neither of them is smiling. Return true if we are in trouble.


monkeyTrouble(true, true) --> true
monkeyTrouble(false, false) --> true
monkeyTrouble(true, false) --> false
 */
public class monkeyTrouble {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("monkeyTrouble(true, true) --> true\n");
		assertEquals("monkeyTrouble(true, true) --> true", true, monkeyTrouble(true, true));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("monkeyTrouble(false, false) --> true\n");
		assertEquals("monkeyTrouble(false, false) --> true", true, monkeyTrouble(false, false));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("monkeyTrouble(true, false) --> false\n");
		assertEquals("monkeyTrouble(true, false) --> false", false, monkeyTrouble(true, false));
		i++;
	}

	
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		
		if ((aSmile==true && bSmile==true)||(aSmile==false && bSmile==false)) {
			return true;
		}
		
		else {
			return false;
		}
		
	}

}

