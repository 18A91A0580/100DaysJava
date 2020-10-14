package sets;
import java.util.*;
public class Sets {

	public static void main(String[] args) {
		HashSet<String> f1 =new HashSet<>(); // order of added elements is not sequential
		f1.add("Banana");
		f1.add("Apple");
		f1.add("Kiwi");
		System.out.println(f1);
		Set<String> f2=new LinkedHashSet<>();//order of added elements is sequential but the time complexity increases
		f2.add("Banana");
		f2.add("Apple");
		f2.add("Kiwi");
		f2.add("Kiwi");
		System.out.println(f2);
		Set<String> f3=new TreeSet<>(); //order of added elements is sorted
		f3.add("Banana");
		f3.add("Apple");
		f3.add("Kiwi");
		System.out.println(f3);
	}

}
