/**
 * @author Luis Teixeira
 *
 * @date   02/04/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package String_2;

import static org.junit.Assert.*;

import org.junit.Test;

/**

Return the number of times that the string "hi" appears anywhere in the given string.


countHi("abc hi ho") --> 1
countHi("ABChi hi") --> 2
countHi("hihi") --> 2 
 */
public class countHi {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("countHi(\"abc hi ho\") --> 1\n");
		assertEquals("countHi(\"abc hi ho\") --> 1", 1, countHi("abc hi ho"));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("countHi(\"ABChi hi\") --> 2\n");
		assertEquals("countHi(\"ABChi hi\") --> 2", 2, countHi("ABChi hi"));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("countHi(\"hihi\") --> 2 \n");
		assertEquals("countHi(\"hihi\") --> 2 ", 2, countHi("hihi"));
		i++;
	}
	
	public int countHi(String str) {
	
		int val = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
		}
	}
}
