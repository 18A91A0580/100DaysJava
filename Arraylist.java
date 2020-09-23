package arrayList;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<>();
		ArrayList<String> b=new ArrayList<>();
		a.add("apple");
		a.add("orange");
		b.add("apple");
		b.add("tomato");
		
		a.addAll(b);
		System.out.println(a);
		System.out.println(a.get(2));
		System.out.println(a.set(2,"beetroot"));
		System.out.println(a);
		a.remove(2);
		System.out.println(a);
		ArrayList<String> c=new ArrayList<>();
		c.add("tomato");
		c.add("orange");
		a.removeAll(c);
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.contains("apple"));
		System.out.println(a.isEmpty());
		a.add("orange");
		
		String[] temp=new String[a.size()];
		
		a.toArray(temp);
		for(String e:temp)
		    System.out.print(e+" ");
	}
}
