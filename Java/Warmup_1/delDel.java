/**
 * @author 	Luis Teixeira
 *
 * @data 	30 May 2018
 *
 * @mail	filipe.teixeira.996@gmail.com 
 */
package Warmup_1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
 
Given a string, if the string "del" appears starting at index 1, 
return a string where that "del" has been deleted. 
Otherwise, return the string unchanged.


delDel("adelbc") --> "abc"
delDel("adelHello") --> "aHello"
delDel("adedbc") --> "adedbc"
 */
public class delDel {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("delDel(\"adelbc\") --> \"abc\"\n");
		assertEquals("delDel(\"adelbc\") --> \"abc\"", "abc", delDel("adelbc"));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("delDel(\"adelHello\") --> \"aHello\"\n");
		assertEquals("delDel(\"adelHello\") --> \"aHello\"", "aHello", delDel("adelHello"));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("delDel(\"adedbc\") --> \"adedbc\"\n");
		assertEquals("delDel(\"adedbc\") --> \"adedbc\"", "adedbc", delDel("adedbc"));
		i++;
	}
	
	
	public String delDel(String str) {
		  
	}
}
