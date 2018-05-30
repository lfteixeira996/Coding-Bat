/**
 * @author Luis Teixeira
 *
 * @date   29/03/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package String_3;

import static org.junit.Assert.*;

import org.junit.Test;

/**

Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" 
and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). 
We'll say that a y or z is at the end of a word if there is not an alphabetic letter 
immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)


countYZ("fez day") --> 2
countYZ("day fez") --> 2
countYZ("day fyyyz") --> 2
 */
public class countYZ {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("countYZ(\"fez day\") --> 2\n");
		assertEquals("countYZ(\"fez day\") --> 2", 2, countYZ("fez day"));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("countYZ(\"day fez\") --> 2\n");
		assertEquals("countYZ(\"day fez\") --> 2", 2, countYZ("day fez"));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("countYZ(\"day fyyyz\") --> 2\n");
		assertEquals("countYZ(\"day fyyyz\") --> 2", 2, countYZ("day fyyyz"));
		i++;
	}
	
	public int countYZ(String str) {
		
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			if (!Character.isLetter(str.charAt(i))) {
				if (((str.charAt(i-1)) =='y') || (str.charAt(i-1) =='z')) {
					count++;
					
					System.out.println(""+str.charAt(i));
				}
			}
		}
		
		return count;
	}
}
