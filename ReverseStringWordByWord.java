package leetcode;
import java.util.*;
public class ReverseStringWordByWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String a="";
		s.trim();
		int i=s.length()-1;
		while(i>=0) {
			
			while(i>=0 && s.charAt(i)==' ') i--;
			int j=i;
			
			while(i>=0 && s.charAt(i)!=' ') i--;
			if(a.isEmpty())
			  a=a+s.substring(i+1,j+1);
			else a=a+" "+s.substring(i+1,j+1);
		}
		System.out.print(a);

	}

}
