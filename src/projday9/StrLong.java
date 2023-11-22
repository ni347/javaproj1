package projday9;

import java.util.HashSet;
import java.util.Set;

public class StrLong {

	public int lenghtofLongestSubstring(String s, Set<Character> set) {
//		HashSet<String> s = new HashSet<>();
		int max=0,i=0,j=0;
		while(i<s.length()) {
			if(!set.contains(s.charAt(i))) {
				set.add(s.charAt(i++));
				max=Math.max(max, set.size());
			}
			else {
				set.remove(s.charAt(j++));
			}
//			System.out.println(set);
		}
		return max;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StrLong sl = new StrLong();
		Set<Character> s1 = new HashSet<>();
		String s = "abcabcdebb";
		System.out.println(sl.lenghtofLongestSubstring(s, s1));
	}
}
