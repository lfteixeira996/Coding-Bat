/**
 * @author Luis Teixeira
 *
 * @date   02/04/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package String_2;

import static org.junit.Assert.*;

import org.junit.Test;

/**

Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
You may assume that n is between 0 and the length of the string, inclusive.


repeatEnd("Hello", 3) --> "llollollo"
repeatEnd("Hello", 2) --> "lolo"
repeatEnd("Hello", 1) --> "o"
 */
public class repeatEnd {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("repeatEnd(\"Hello\", 3) --> \"llollollo\"\n");
		assertEquals("repeatEnd(\"Hello\", 3) --> \"llollollo\"", "llollollo", repeatEnd("Hello", 3));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("repeatEnd(\"Hello\", 2) --> \"lolo\"\n");
		assertEquals("repeatEnd(\"Hello\", 2) --> \"lolo\"", "lolo", repeatEnd("Hello", 2));
		i++;
	}

	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("repeatEnd(\"Hello\", 1) --> \"o\"\n");
		assertEquals("repeatEnd(\"Hello\", 1) --> \"o\"", "o", repeatEnd("Hello", 1));
		i++;
	}
	
	public String repeatEnd(String str, int n) {
		  
		String aux = str.substring(str.length()-n, str.length());
		String ret = "";
		
		for (int i = 0; i < n; i++) {
			ret += aux;
		}

		return ret;
	}
}
