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
Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.


seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue"

 */
public class seeColor {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("seeColor(\"redxx\") → \"red\"\n");
		assertEquals("seeColor(\"redxx\") → \"red\"", "red", seeColor("redxx"));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("seeColor(\"xxred\") → \"\"\n");
		assertEquals("seeColor(\"xxred\") → \"\"", "", seeColor("xxred"));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("seeColor(\"blueTimes\") → \"blue\"\n");
		assertEquals("seeColor(\"blueTimes\") → \"blue\"", "blue", seeColor("blueTimes"));
		i++;
	}
	
	
	public String seeColor(String str) {
		  
	}

}
