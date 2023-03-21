package one.org;

import java.util.LinkedHashMap;
import java.util.Map;

public class Duplicate_Character {
public static void main(String[] args) {
	String s="hai greens hai all greens";
	String[] split = s.split(" ");
	Map<String,Integer> m=new LinkedHashMap();
	for(String string:split)
	{
		if(m.containsKey(string)) {
			Integer integer = m.get(string);
			 m.put(string, integer+1);	
			System.out.println(m);
		}
		else {
			m.put(string, 0);
		}
		
	}
	
}
}
