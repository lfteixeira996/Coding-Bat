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
 * 
Given an "out" string length 4, such as "<<>>", and a word, 
return a new string where the word is in the middle of the 
out string, e.g. "<<word>>". Note: use str.substring(i, j) to 
extract the String starting at index i and going up to but not including index j.


makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]"
 */
public class makeOutWord {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("makeOutWord(\"<<>>\", \"Yay\")\n");
		assertEquals("makeOutWord(\"<<>>\", \"Yay\") → \"<<Yay>>\"", "<<Yay>>", makeOutWord("<<>>", "Yay"));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("makeOutWord(\"<<>>\", \"WooHoo\") → \"<<WooHoo>>\"\n");
		assertEquals("makeOutWord(\"<<>>\", \"WooHoo\") → \"<<WooHoo>>\"", "<<WooHoo>>", makeOutWord("<<>>", "WooHoo"));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("makeOutWord(\"[[]]\", \"word\") → \"[[word]]\"\n");
		assertEquals("makeOutWord(\"[[]]\", \"word\") → \"[[word]]\"", "[[word]]", makeOutWord("[[]]", "word"));
		i++;
	}

	public String makeOutWord(String out, String word) {
		  
		return out.substring(0,2)+word+out.substring(2,out.length());
	}
}
