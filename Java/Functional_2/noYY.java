/**
 * @author Luis Teixeira
 *
 * @date   03/04/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Functional_2;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

/**
Given a list of strings, return a list where each string 
has "y" added at its end, omitting any resulting strings that contain "yy" as a substring anywhere.


noYY(["a", "b", "c"]) → ["ay", "by", "cy"]
noYY(["a", "b", "cy"]) → ["ay", "by"]
noYY(["xx", "ya", "zz"]) → ["xxy", "yay", "zzy"]
 */
public class noYY {

	private static int i = 0;
	List<String> num = new LinkedList<String>();
	List<String> exp = new LinkedList<String>();
	
	@Test
	public void Test1()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("noYY([\"a\", \"b\", \"c\"]) → [\"ay\", \"by\", \"cy\"]\n");
		
		//actual
		num.add("a");
		num.add("b");
		num.add("c");
		
		//expected
		exp.add("ay");
		exp.add("by");
		exp.add("cy");

		assertEquals("noYY([\"a\", \"b\", \"c\"]) → [\"ay\", \"by\", \"cy\"]", exp, noYY(num));
		i++;
	}

	@Test
	public void Test2()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("noYY([\"a\", \"b\", \"cy\"]) → [\"ay\", \"by\"]\n");
		
		//actual
		num.add("a");
		num.add("b");
		num.add("cy");
		
		//expected
		exp.add("ay");
		exp.add("by");

		assertEquals("noYY([\"a\", \"b\", \"cy\"]) → [\"ay\", \"by\"]", exp, noYY(num));
		i++;
	}
	
	@Test
	public void Test3()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("noYY([\"xx\", \"ya\", \"zz\"]) → [\"xxy\", \"yay\", \"zzy\"]\n");
		
		//actual
		num.add("xx");
		num.add("ya");
		num.add("zz");
		
		//expected
		exp.add("xxy");
		exp.add("yay");
		exp.add("zzy");
		
		assertEquals("noYY([\"xx\", \"ya\", \"zz\"]) → [\"xxy\", \"yay\", \"zzy\"]", exp, noYY(num));
		i++;
	}
	
	public List<String> noYY(List<String> strings) {
		  
		List<String> ret = new LinkedList<String>();
		int aux, x = 0;
		
		if (strings.size()<1) {
			ret.add("y");
		}
				
		for (int i = 0; i < strings.size(); i++) {
			
			aux = strings.get(i).length()-1;
			
			if (strings.get(i).charAt(aux) != 'y' && !(strings.get(i).contains("yy"))) {
				ret.add(x, strings.get(i)+"y");
				x++;
			}
		}
		
		return ret;
	}
}
