package sets;

import java.util.*;

public class MethodsOfSets {

	public static void main(String[] args) {
		Set<Integer> s=new HashSet<>();
		s.add(3);
		s.add(1);
		s.add(2);
		Set<Integer> s1=new HashSet<>();
		s1.add(1);
		s1.add(4);
		s.addAll(s1);   //union
		System.out.println(s);
	s.retainAll(s1); //intersection
		System.out.println(s);
		System.out.println(s1);
		int sum=1;
		System.out.println(s.contains(sum));
	System.out.println(s.containsAll(s1)); //subset or not
	}

}
