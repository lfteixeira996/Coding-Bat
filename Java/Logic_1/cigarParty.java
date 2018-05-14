/**
 * @author Luis Teixeira
 *
 * @date   28/03/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Logic_1;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**

When squirrels get together for a party, they like to have cigars.
A squirrel party is successful when the number of cigars is between
40 and 60, inclusive. Unless it is the weekend, in which case there is
no upper bound on the number of cigars. Return true if the party with the
given values is successful, or false otherwise.


cigarParty(30, false) --> false
cigarParty(50, false) --> true
cigarParty(70, true) --> true
 */
public class cigarParty {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("cigarParty(30, false) --> false\n");
		assertEquals(false, cigarParty(30, false));
	    i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("cigarParty(50, false) --> true\n");
		assertEquals(true, cigarParty(50, true));
	    i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("cigarParty(70, true) --> true\n");
		assertEquals(true, cigarParty(70, true));
	    i++;
	}

	
	public boolean cigarParty(int cigars, boolean isWeekend) {
		  
		if (isWeekend == true && cigars>=40) {
			return true;
		}
		
		else {
			if (cigars>=40 && cigars<=60) {
				return true;
			}
			
			else {
				return false;
			}
		}
		
	}

}
