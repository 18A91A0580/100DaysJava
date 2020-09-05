package linkedList;
import java.util.*;
public class Linkedlist {
	
	static void timeDiff(List<Integer> list) {
		long start=System.currentTimeMillis();
		for(int i=0;i<=100000;i++) {
			list.add(0,i);
		}
		long end=System.currentTimeMillis();
		System.out.println(list.getClass().getName()+"-->"+(end-start));
	}
	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		ArrayList<Integer> al=new ArrayList<>();
		timeDiff(al);
		timeDiff(ll);

	}

}
