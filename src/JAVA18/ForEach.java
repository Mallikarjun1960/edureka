package JAVA18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ForEach {
	
	public static int a=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a=20;
		
		Map<String, String>map=new HashMap<String, String>();
		map.put("1", "vlue");
		map.put("2", "value2");
		map.forEach((k,v)->System.out.println(k+""+v));
		for(Map.Entry<String, String>map1:map.entrySet()) {
			System.out.println(map1.getKey()+""+map1.getValue());
			
			
		}
		Iterator<Map.Entry<String, String>>itr=map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<String, String>map3=itr.next();
			System.out.println(map3.getKey()+" "+map3.getValue());
			a=30;
		}
		

	}
	

}
