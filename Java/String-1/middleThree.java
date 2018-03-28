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
Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.


middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi"

 */
public class middleThree {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("middleThree(\"Candy\") → \"and\"\n");
		assertEquals("middleThree(\"Candy\") → \"and\"", "and", middleThree("Candy"));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("middleThree(\"and\") → \"and\"\n");
		assertEquals("middleThree(\"and\") → \"and\"", "and", middleThree("and"));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("middleThree(\"solving\") → \"lvi\"\n");
		assertEquals("middleThree(\"solving\") → \"lvi\"", "lvi", middleThree("solving"));
		i++;
	}
	

	public String middleThree(String str) {
		  
	}

}
