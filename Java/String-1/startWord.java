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
Given a string and a second "word" string, we'll say 
that the word matches the string if it appears at the 
front of the string, except its first char does not need to match exactly. 
On a match, return the front of the string, or otherwise return the empty string. 
So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". 
The word will be at least length 1.


startWord("hippo", "hi") → "hi"
startWord("hippo", "xip") → "hip"
startWord("hippo", "i") → "h"
 */
public class startWord {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("startWord(\"hippo\", \"hi\") → \"hi\"\n");
		assertEquals("startWord(\"hippo\", \"hi\") → \"hi\"", "hi", startWord("hippo", "hi"));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("startWord(\"hippo\", \"xip\") → \"hip\"\n");
		assertEquals("startWord(\"hippo\", \"xip\") → \"hip\"", "hip", startWord("hippo", "xip"));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("startWord(\"hippo\", \"i\") → \"h\"\n");
		assertEquals("startWord(\"hippo\", \"i\") → \"h\"", "h", startWord("hippo", "i"));
		i++;
	}
	
	public String startWord(String str, String word) {
		  
	}

	

}
