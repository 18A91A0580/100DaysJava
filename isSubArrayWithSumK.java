package sets;
import java.util.*;
public class isSubArrayWithSumK {

	public static void main(String[] args) {
		int[] a= {2,1,3,-4,-2};
		int k=6;
		boolean found=false;
		HashSet<Integer> s=new HashSet<>();
		int sum=0;
		for(int e:a) {
			s.add(sum);

			sum+=e;
			if(s.contains(sum-k)) {
				found=true;
				break;
			}
		}
		System.out.println(found);
	}

}
