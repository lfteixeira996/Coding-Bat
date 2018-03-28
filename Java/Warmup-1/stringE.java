/**
 * @author Luis Teixeira
 *
 * @date   28/03/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Warmup_1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
Return true if the given string contains between 1 and 3 'e' chars.


stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
*/

public class stringE{
	
	@Test
	public void Test1()
	{
		/*Test 1*/
		System.out.println("**********Test 1**********");
		System.out.println("Calculate stringE(\"Hello\")\n");
		assertEquals("stringE(\"Hello\") = true", true, stringE("Hello"));
	}
	
	@Test
	public void Test2()
	{
		/*Test 2*/
		System.out.println("**********Test 2**********");
		System.out.println("Calculate stringE(\"Heelle\")\n");
		assertEquals("stringE(\"Heelle\") = true", true, stringE("Heelle"));
	}

	@Test
	public void Test3()
	{
		/*Test 3*/
		System.out.println("**********Test 3**********");
		System.out.println("Calculate stringE(\"Heelele\")\n");
		assertEquals("stringE(\"Heelele\") = false", false, stringE("Heelele"));
	}
	
	/********************************/
	public boolean stringE(String str) {
		
		char array[] = str.toCharArray();
		int count = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			if(array[i] == 'e')
			{
				count++;
			}
		}
		
		if (count>=1 && count <=3)
			return true;
		
		else
			return false;
	}	
}
