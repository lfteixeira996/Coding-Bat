/**
 * @author Luis Teixeira
 *
 * @date   29/03/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package String_2;

import static org.junit.Assert.*;

import org.junit.Test;

/**

Return the number of times that the string "code" appears anywhere in the given string,
except we'll accept any letter for the 'd', so "cope" and "cooe" count.


countCode("aaacodebbb") --> 1
countCode("codexxcode") --> 2
countCode("cozexxcope") --> 2
 */
public class countCode {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("countCode(\"aaacodebbb\") --> 1\n");
		assertEquals("countCode(\"aaacodebbb\") --> 1", 1, countCode(\"aaacodebbb\"));
		i++;
	}

	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("countCode(\"codexxcode\") --> 2\n");
		assertEquals("countCode(\"codexxcode\") --> 2", 2, countCode(\"codexxcode\"));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("countCode(\"cozexxcope\") --> 2\n");
		assertEquals("countCode(\"cozexxcope\") --> 2", 2, countCode("cozexxcope"));
		i++;
	}
	public int countCode(String str) {
		  
	}

}
