package leetcode;
import java.util.*;
public class GroupAnagrams {

	public static void main(String[] args) {
		String[ ] strs= {"cat","tac","arc","car"};
		List<List<String>> list=group(strs);
		System.out.println(list);
	}
	static List<List<String>> group(String[] strs) {
		Map<String,List<String>> map=new HashMap<>();
		for(String s:strs) {
			char[] charArray=s.toCharArray();
			Arrays.sort(charArray);
			String sorted=new String(charArray);
			if(!map.containsKey(sorted)) {
				map.put(sorted, new LinkedList<>());
			}
			map.get(sorted).add(s);
		}
		return new LinkedList<>(map.values());
	}

}
