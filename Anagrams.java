package strings;
import java.util.*;
public class Anagrams {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st string :");
		String a=sc.nextLine();
		System.out.println("Enter 2nd string :");
		String b=sc.nextLine();
		boolean isAnagram=true;
		int[] al=new int[256];
		for(int i=0;i<a.length();i++)    //for(char c:a.toCharArray()){
		{								 //int index=(int)c;
			int index=(int)a.charAt(i);	 //al[index]++; }
			al[index]++;
		}
		for(int i=0;i<b.length();i++)    //for(char c:b.toCharArray()){
		{								 //int index=(int)c;
			int index=(int)b.charAt(i);  //al[index]--; }
			al[index]--;
		}
		for(int i:al) {
			if(i!=0) {
				isAnagram=false;
				break;
			}
		}
		if(isAnagram) System.out.println("Anagram");
		else System.out.println("Not Anagram");
	}

}
