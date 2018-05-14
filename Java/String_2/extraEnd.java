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

Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.


extraEnd("Hello") --> "lololo"
extraEnd("ab") --> "ababab"
extraEnd("Hi") --> "HiHiHi"
 */
public class extraEnd {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("extraEnd(\"Hello\") --> \"lololo\"\n");
		assertEquals("extraEnd(\"Hello\") --> \"lololo\"", "lololo", extraEnd("Hello"));
		i++;
	}

	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("extraEnd(\"ab\") --> \"ababab\"\n");
		assertEquals("extraEnd(\"ab\") --> \"ababab\"", "ababab", extraEnd("ab"));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("extraEnd(\"Hi\") --> \"HiHiHi\"\n");
		assertEquals("extraEnd(\"Hi\") --> \"HiHiHi\"", "HiHiHi", extraEnd("Hi"));
		i++;
	}
	
	public String extraEnd(String str) {

		String ret = "";
		
		if (str.length()==2) {
			ret = str+str+str;
			return ret;
		}
		
		else {
			ret = str.substring(str.length()-2, str.length());
			return ret+ret+ret;
		}
	}
}
