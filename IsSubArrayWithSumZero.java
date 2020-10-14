package sets;

import java.util.*;

public class IsSubArrayWithSumZero {

	public static void main(String[] args) {
		int a[]= {2,1,3,-4,-2};
		boolean found=false;
		HashSet<Integer> hs=new HashSet<>();
		int sum=0;
		for(int e:a) {
			hs.add(sum);
			sum+=e;
			if(hs.contains(sum)) {
				found=true;
				break;
			}
			
		}
		System.out.print(found);
	}

}
