/**
 * @author Luis Teixeira
 *
 * @date   04/04/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package String_2;

import static org.junit.Assert.*;

import org.junit.Test;

/**

Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".


makeAbba("Hi", "Bye") --> "HiByeByeHi"
makeAbba("Yo", "Alice") --> "YoAliceAliceYo"
makeAbba("What", "Up") --> "WhatUpUpWhat"
 */
public class makeAbba {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("makeAbba(\"Hi\", \"Bye\") --> \"HiByeByeHi\"\n");
		assertEquals("makeAbba(\"Hi\", \"Bye\") --> \"HiByeByeHi\"", "HiByeByeHi", makeAbba("Hi", "Bye"));
		i++;
	}

	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("makeAbba(\"Yo\", \"Alice\") --> \"YoAliceAliceYo\"\n");
		assertEquals("makeAbba(\"Yo\", \"Alice\") --> \"YoAliceAliceYo\"", "YoAliceAliceYo", makeAbba("Yo", "Alice"));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("makeAbba(\"What\", \"Up\") --> \"WhatUpUpWhat\"\n");
		assertEquals("makeAbba(\"What\", \"Up\") --> \"WhatUpUpWhat\"", "WhatUpUpWhat", makeAbba("What", "Up"));
		i++;
	}
	
	public String makeAbba(String a, String b) {
		  
		String ret = a+b+b+a;
		
		return ret;
	}
}
