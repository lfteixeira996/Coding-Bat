package test;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * 
Given a string, return a string made of the first 2 chars (if present),
however include first char only if it is 'o' and include the second only
if it is 'z', so "ozymandias" yields "oz".


startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
 */
public class startOz {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("startOz(\"ozymandias\") → \"oz\"\n");
		assertEquals("startOz(\"ozymandias\") → \"oz\"", "oz", startOz("ozymandias"));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("startOz(\"bzoo\") → \"z\"\n");
		assertEquals("startOz(\"bzoo\") → \"z\"", "z", startOz("bzoo"));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("startOz(\"oxx\") → \"o\"\n");
		assertEquals("startOz(\"oxx\") → \"o\"", "o", startOz("oxx"));
		i++;
	}
	
	
	public String startOz(String str) {
		
		if(str.length() >= 2) {
				
			if (str.charAt(0)=='o' && str.charAt(1)=='z') {
				return "oz";
			}
		}
		
		if(str.length() == 0) {
			return "";
		}
		
		if (str.charAt(0)=='o') {
			return "o";
		}
		
		if (str.charAt(1)=='z') {
			return "z";
		}
		
		else {
			return "";
		}

	}


}
