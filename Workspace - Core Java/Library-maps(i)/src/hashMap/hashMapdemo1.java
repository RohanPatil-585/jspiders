package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class hashMapdemo1 
{
	public static void main(String[] args) 
	{
		HashMap h1 = new HashMap();
		System.out.println("map size ="+h1.size());
		System.out.println("is map empty?? "+h1.isEmpty());
		
		h1.put(12 , "jspiders");
		h1.put(2.3 , 'c');
		h1.put(true , "null" );
		h1.put(null , 353);
		h1.put("true" , 5.6);
		h1.put(null, 353);
		
		System.out.println("map size ="+h1.size());
		System.out.println("is map empty?? "+h1.isEmpty());
		System.out.println(h1);
		
		System.out.println("key 2.3 is found?? "+h1.containsKey(2.3));
		System.out.println("value 'c' is found?? "+h1.containsValue('c'));
		
		String s1 = (String)h1.get(12);
		System.out.println(s1.toUpperCase());
		
		h1.remove(12);
		System.out.println("map size ="+h1.size());
		Object o1 = h1.get(12);
		System.out.println(o1);
		
		Object o2 = h1.get(null);
		System.out.println(o2);
		
		System.out.println();
		System.out.println(h1);
		
		System.out.println();
		Set set1 = h1.keySet();
		Iterator i1 = set1.iterator();
		while(i1.hasNext())
		{
			Object key = i1.next();
			Object value = h1.get(key);
			
			System.out.println(key + "-->"+value);
		}
	}
}
