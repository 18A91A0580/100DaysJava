package sets;
import java.util.*;
public class NoOfSubArraysWithSumEqualsK {

	public static void main(String[] args) {
		int[] a= {2,1,3,-4,-2,12};
		Set<Integer> s=new HashSet<>();
		int c=0,sum=0;
		int k=6;
		for(int e:a) {
			s.add(sum);
			sum+=e;
			if(s.contains(sum-k)) c++;
		}
		System.out.println(c);
	}

}
