/**
 * @author Luis Teixeira
 *
 * @date   28/03/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package String_1;

import static org.junit.Assert.*;

import org.junit.Test;

/*
Given 2 strings, a and b, return a new string made of 
the first char of a and the last char of b, so "yo" and 
"java" yields "ya". If either string is length 0, use '@' for its missing char.


lastChars("last", "chars") → "ls"
lastChars("yo", "java") → "ya"
lastChars("hi", "") → "h@"
 */
public class lastChars {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("lastChars(\"last\", \"chars\") → \"ls\"\n");
		assertEquals("lastChars(\"last\", \"chars\") → \"ls\"", "ls", lastChars("last", "chars"));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("lastChars(\"yo\", \"java\") → \"ya\"\n");
		assertEquals("lastChars(\"yo\", \"java\") → \"ya\"", "ya", lastChars("yo", "java"));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("lastChars(\"hi\", \"\") → \"h@\"\n");
		assertEquals("lastChars(\"hi\", \"\") → \"h@\"", "h@", lastChars("hi", ""));
		i++;
	}

	public String lastChars(String a, String b) {
		  
		char first;
		char last;  
		
		if (a == "") {
			first = '@';
		}
		
		else {
			first = a.charAt(0);
		}
		
		if (b == "") {
			last = '@';
		}
		
		else {
			last  = b.charAt(b.length()-1);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(first);
		sb.append(last);
		
		return  sb.toString();
		
	}

}
