/**
 * @author 	Luis Teixeira
 *
 * @data 	5 Jun 2018
 *
 * @mail	filipe.teixeira.996@gmail.com 
 */
package Warmup_1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
 
Given a non-empty string like "Code" return a string like "CCoCodCode".


stringSplosion("Code") --> "CCoCodCode"
stringSplosion("abc") --> "aababc"
stringSplosion("ab") --> "aab"

 */
public class stringSplosion {

	private static int i = 1;
	
	@Test
	public void Test1()
	{	
		System.out.println("**********Test "+i+"**********");
		assertEquals("stringSplosion(\"Code\") --> \"CCoCodCode\"", "CCoCodCode", stringSplosion("Code"));
		i++;
	}
	
	@Test
	public void Test2()
	{	
		System.out.println("**********Test "+i+"**********");
		assertEquals("stringSplosion(\"abc\") --> \"aababc\"", "aababc", stringSplosion("abc"));
		i++;
	}
	
	@Test
	public void Test3()
	{	
		System.out.println("**********Test "+i+"**********");
		assertEquals("stringSplosion(\"ab\") --> \"aab\"", "aab", stringSplosion("ab"));
		i++;
	}
	
	public String stringSplosion(String str) {
		
		String one = str.substring(0, 1)+str.substring(0, 1);
		
		return one+str.substring(1,2)+str;
	}

}
