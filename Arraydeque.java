package queue;
import java.util.ArrayDeque;
public class Arraydeque {

	public static void main(String[] args) {
		ArrayDeque<Integer> ad=new ArrayDeque<>();     //we can implement it with Queue or Deque
		ad.addFirst(1);
		ad.addFirst(2);
		ad.addLast(3);
		System.out.println(ad);
		System.out.println(ad.removeFirst());
		System.out.println(ad);
		System.out.println(ad.removeLast());
		System.out.println(ad);
		ad.addFirst(2);
		ad.addFirst(4);
		System.out.println(ad);
		System.out.println(ad.peekFirst());
		System.out.println(ad.peekLast());
//		ad.push(1);       //we can implement stack too
//		ad.push(2);
//		ad.push(3);
//		System.out.println(ad);
//		System.out.println(ad.pop());
	}

}
