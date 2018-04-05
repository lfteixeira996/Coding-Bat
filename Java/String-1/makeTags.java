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

The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
In this example, the "i" tag makes <i> and </i> which surround the word "Yay". 
Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".


makeTags("i", "Yay") → "<i>Yay</i>"
makeTags("i", "Hello") → "<i>Hello</i>"
makeTags("cite", "Yay") → "<cite>Yay</cite>"
 */
public class makeTags {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("makeTags(\"i\", \"Yay\") → \"<i>Yay</i>\"\n");
		assertEquals("makeTags(\"i\", \"Yay\") → \"<i>Yay</i>\"", "<i>Yay</i>", makeTags("i", "Yay"));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("makeTags(\"i\", \"Hello\") → \"<i>Hello</i>\"\n");
		assertEquals("makeTags(\"i\", \"Hello\") → \"<i>Hello</i>\"", "<i>Hello</i>", makeTags("i", "Hello"));
		i++;
	}

	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("makeTags(\"cite\", \"Yay\") → \"<cite>Yay</cite>\"\n");
		assertEquals("makeTags(\"cite\", \"Yay\") → \"<cite>Yay</cite>\"", "<cite>Yay</cite>", makeTags("cite", "Yay"));
		i++;
	}
	
	public String makeTags(String tag, String word) {
		  
		return "<"+tag+">"+word+"</"+tag+">";
	}
}
