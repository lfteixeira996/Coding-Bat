/**
 * @author 	Luis Teixeira
 *
 * @data 	4 Jun 2018
 *
 * @mail	filipe.teixeira.996@gmail.com 
 */
package String_1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
 
Given two strings, append them together (known as "concatenation") and return the result.
However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".


conCat("abc", "cat") → "abcat"
conCat("dog", "cat") → "dogcat"
conCat("abc", "") → "abc"
 */
public class conCat {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("conCat(\"abc\", \"cat\") → \"abcat\"\n");
		assertEquals("conCat(\"abc\", \"cat\") → \"abcat\"", "abcat", conCat("abc", "cat"));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("conCat(\"dog\", \"cat\") → \"dogcat\"\n");
		assertEquals("conCat(\"dog\", \"cat\") → \"dogcat\"", "dogcat", conCat("dog", "cat"));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("conCat(\"abc\", \"\") → \"abc\"\n");
		assertEquals("conCat(\"abc\", \"\") → \"abc\"", "abc", conCat("abc", ""));
		i++;
	}
	
	
	public String conCat(String a, String b) {
	
		
		if (a.charAt(a.length()-1) == b.charAt(b.length()-1)) {
		
			return a.concat(b.substring(0, b.length()-1));
		}
		
		return a+b;
	}
}
