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

Given two strings, append them together (known as "concatenation") and return the result. 
However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".


conCat("abc", "cat") --> "abcat"
conCat("dog", "cat") --> "dogcat"
conCat("abc", "") --> "abc"
 */
public class conCat {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("conCat(\"abc\", \"cat\") --> \"abcat\"\n");
		assertEquals("conCat(\"abc\", \"cat\") --> \"abcat\"", "abcat", conCat("abc", "cat"));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("conCat(\"dog\", \"cat\") --> \"dogcat\"\n");
		assertEquals("conCat(\"dog\", \"cat\") --> \"dogcat\"", "dogcat", conCat("dog", "cat"));
		i++;
	}

	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("conCat(\"abc\", \"\") --> \"abc\"\n");
		assertEquals("conCat(\"abc\", \"\") --> \"abc\"", "abc", conCat("abc", ""));
		i++;
	}
	
	
	public String conCat(String a, String b) {
		  
		String ret = "";
		char aux1, aux2;
		
		aux1 = a.charAt(a.length()-2);
		aux2 = b.charAt(b.charAt(0));
						
		if (aux1 == aux2) {
			ret = a.substring(0, a.length()-2)+b;
			System.out.println(ret);
			return ret;
		}
		
		else {
			ret = a+b;
			System.out.println(ret);
			return ret;
		}	
		
	}
}
