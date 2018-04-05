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

Given two strings, a and b, create a bigger string made of the first char of a, 
the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.


mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
 */
public class mixString {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("mixString(\"abc\", \"xyz\") → \"axbycz\"\n");
		assertEquals("mixString(\"abc\", \"xyz\") → \"axbycz\"", "axbycz", mixString("abc", "xyz"));
		i++;
	}

	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("mixString(\"Hi\", \"There\") → \"HTihere\"\n");
		assertEquals("mixString(\"Hi\", \"There\") → \"HTihere\"", "HTihere", mixString("Hi", "There"));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("mixString(\"xxxx\", \"There\") → \"xTxhxexre\"\n");
		assertEquals("mixString(\"xxxx\", \"There\") → \"xTxhxexre\"", "xTxhxexre", mixString("xxxx", "There"));
		i++;
	}
	
	public String mixString(String a, String b) {
		
		String aux = "";
		int aux1 = Math.min(a.length(), b.length());
		
		for (int i = 0; i < aux1; i++) {
			
			aux.concat(""+a.charAt(i) + b.charAt(i));
		}
		
		
		System.out.println(""+aux);
		
		return aux;
		
	}
}
