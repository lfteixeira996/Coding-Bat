/**
 * @author Luis Teixeira
 *
 * @date   02/04/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package String_3;

import static org.junit.Assert.*;

import org.junit.Test;

/**

Given a string, return the longest substring that appears at
both the beginning and end of the string without overlapping. 
For example, sameEnds("abXab") is "ab".


sameEnds("abXYab") --> "ab"
sameEnds("xx") --> "x"
sameEnds("xxx") --> "x" 
 */
public class sameEnds {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("sameEnds(\"abXYab\") --> \"ab\"\n");
		assertEquals("sameEnds(\"abXYab\") --> \"ab\"","ab", sameEnds("abXYab"));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("sameEnds(\"xx\") --> \"x\"\n");
		assertEquals("sameEnds(\"xx\") --> \"x\"","x", sameEnds("xx"));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("sameEnds(\"xxx\") --> \"x\" \n");
		assertEquals("sameEnds(\"xxx\") --> \"x\"","x", sameEnds("xxx"));
		i++;
	}
	
	public String sameEnds(String string) {
		  
	}

}
