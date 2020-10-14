package maps;
import java.util.*;
import java.util.Map.Entry;
public class Maps {

	public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("one", 1);
		hm.put("five", 5);
		hm.put("nine", 9);
		System.out.println(hm);
		hm.put("one",2);
		System.out.println(hm);//replaces existing value
		HashMap<String,Integer> hm1=new HashMap<>();
		hm1.put("three", 1);
		hm1.put("six", 6);
		hm1.put("nine", 9);
		hm.putAll(hm1);
		System.out.println(hm);
		hm.putIfAbsent("one",6);//insert value only if  the key is not used
		System.out.println(hm);
		System.out.println(hm.get("five"));
		System.out.println(hm.containsKey("one"));
		System.out.println(hm.containsValue(6));
		hm.replace("one",1);
		System.out.println(hm);
		hm.replace("one",1, 6);//replaces value only if key is associated with old value
		System.out.println(hm);
		hm.remove("three");
		System.out.println(hm);
		hm.remove("five",6);//removes only if five is associated with 6 (here)
		System.out.println(hm);
		System.out.println(hm.keySet());//returns key set
		System.out.println(hm.values());//returns values set
		System.out.println(hm.entrySet());//returns entry set
		
		
		
		for(Entry<String,Integer> entry:hm.entrySet()) {
			entry.setValue(entry.getValue()*100);
		}
		System.out.println(hm);
		
		
		System.out.println(hm.get("five"));
	}
	

}
