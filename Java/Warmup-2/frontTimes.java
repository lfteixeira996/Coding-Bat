/**
 * @author Luis Teixeira
 *
 * @date   02/04/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Warmup_2;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**

Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
or whatever is there if the string is less than length 3. Return n copies of the front;


frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
 */
public class frontTimes {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("frontTimes(\"Chocolate\", 2) → \"ChoCho\"\n");    
	    assertEquals("ChoCho", frontTimes("Chocolate", 2));
	    i++;
	}

	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("frontTimes(\"Chocolate\", 3) → \"ChoChoCho\"\n");    
	    assertEquals("ChoChoCho", frontTimes("Chocolate", 3));
	    i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("frontTimes(\"Abc\", 3) → \"AbcAbcAbc\"\n");    
	    assertEquals("AbcAbcAbc", frontTimes("Abc", 3));
	    i++;
	}
	
	
	public String frontTimes(String str, int n) {
		
		String aux = "";
		String ret = "";
		
		if (str.length()>=3) {
			aux = str.substring(0, 3);
		}
		
		else {
			aux = str;
		}
		
		
		for (int i = 0; i < n; i++) {
			
			ret += aux;
		}

		return ret;
	}
}
