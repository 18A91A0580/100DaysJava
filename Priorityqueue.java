package queue;
import java.util.PriorityQueue;
public class Priorityqueue {

	public static void main(String[] args) {
		 PriorityQueue<String> pq=new PriorityQueue<>();
		 pq.add("Apple");
		 pq.add("Mango");
		 pq.add("Kiwi");
		 pq.add("Banana");
		 System.out.println(pq);       //the elements may or may not be sorted
		 System.out.println(pq.remove());
		 System.out.println(pq.remove());
		 System.out.println(pq.remove());
		 System.out.println(pq.remove());
		 PriorityQueue<Integer>  pq1=new PriorityQueue<>();
		 pq1.add(1);
		 pq1.add(9);
		 pq1.add(3);
		 System.out.println(pq1);
		 System.out.println(pq1.remove());
		 System.out.println(pq1.remove());
		 System.out.println(pq1.remove());
	}

}
