/**
 * @author Luis Teixeira
 *
 * @date   28/03/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Map_1;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

/*
Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value,
and set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the empty string.


mapBully({"a": "candy", "b": "dirt"}) --> {"a": "", "b": "candy"}
mapBully({"a": "candy"}) --> {"a": "", "b": "candy"}
mapBully({"a": "candy", "b": "carrot", "c": "meh"}) --> {"a": "", "b": "candy", "c": "meh"}
 */
public class mapBully {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("mapBully({\"a\": \"candy\", \"b\": \"dirt\"}) --> {\"a\": \"\", \"b\": \"candy\"}\n");

	    Map map=new HashMap();  
	    //Adding elements to map  
	    map.put("a","candy");  
	    map.put("b","dirt");  
 
	    mapBully(map);
	    
	     
		
		//assertEquals("mapBully({\"a\": \"candy\", \"b\": \"dirt\"}) --> {\"a\": \"\", \"b\": \"candy\"}", {"a": "", "b": "candy"}, helloName("Bob"));
		i++;
	}

	
	public Map<String, String> mapBully(Map<String, String> map) {
		  
		int i = 0;
		String aux = null;
		
	    //Traversing Map  
	    Set set		 = map.entrySet();//Converting to Set so that we can traverse  
	    Iterator itr = set.iterator();
	       
	    
	    while(itr.hasNext()){  
	        //Converting to Map.Entry so that we can get key and value separately  
	        Map.Entry entry=(Map.Entry)itr.next();  
	        
	        
	        
	        if (i==0) {
	        	aux = (String) entry.getValue();
	        	map.put((String) entry.getKey(), "");
	        	i++;
			}
	        
	        else {
	        	map.put((String) entry.getKey(), aux);
	        	aux = (String) entry.getValue();
			}
	        
	        
	        //System.out.println(entry.getKey() + " - " + entry.getValue());
	    }
	    
	    
	    
	    
	    return map;
	    
	}
}
