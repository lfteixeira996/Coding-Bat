/**
 * @author Luis Teixeira
 *
 * @date   04/04/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package String_1;

import static org.junit.Assert.*;

import org.junit.Test;

/**

Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.


withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"
 */
public class withoutX {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("withoutX(\"xHix\") → \"Hi\"\n");
		assertEquals("withoutX(\"xHix\") → \"Hi\"", "Hi", withoutX("xHix"));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("withoutX(\"xHi\") → \"Hi\"\n");
		assertEquals("withoutX(\"xHi\") → \"Hi\"", "Hi", withoutX("xHi"));
		i++;
	}
	
	public String withoutX(String str) {

		String ret = "";
		
		if (str.charAt(0)=='x') {
			ret = str.substring(1);
		}
		
		if (str.charAt(str.length()-1)=='x') {
			ret = ret.substring(0,ret.length()-1);
		}
		return ret;
	}
}
