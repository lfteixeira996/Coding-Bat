/**
 * @author Luis Teixeira
 *
 * @date   04/04/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package String_2;

import static org.junit.Assert.*;

import org.junit.Test;

/**

Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.


repeatSeparator("Word", "X", 3) --> "WordXWordXWord"
repeatSeparator("This", "And", 2) --> "ThisAndThis"
repeatSeparator("This", "And", 1) --> "This"
 */
public class repeatSeparator {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("repeatSeparator(\"Word\", \"X\", 3) --> \"WordXWordXWord\"\n");
		assertEquals("repeatSeparator(\"Word\", \"X\", 3) --> \"WordXWordXWord\"", "WordXWordXWord", repeatSeparator("Word", "X", 3));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("repeatSeparator(\"This\", \"And\", 2) --> \"ThisAndThis\"\n");
		assertEquals("repeatSeparator(\"This\", \"And\", 2) --> \"ThisAndThis\"", "ThisAndThis", repeatSeparator("This", "And", 2));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("repeatSeparator(\"This\", \"And\", 1) --> \"This\"\n");
		assertEquals("repeatSeparator(\"This\", \"And\", 1) --> \"This\"", "This", repeatSeparator("This", "And", 1));
		i++;
	}

	public String repeatSeparator(String word, String sep, int count) {
		
		String ret = word;
		
		if (count == 0) {
			return "";
		}
		
		
		for (int i = 0; i < count-1; i++) {
			ret = ret+sep+word;
		}

		return ret;
	}

}
