package projday6;

import java.util.HashSet;
import java.util.Set;
public class longSub {
public int lengthOfLongestSubstring(String s, Set<Character> set) {
	int max = 0, i = 0, j = 0;
    while(i < s.length()) {
        if(!set.contains(s.charAt(i))) {
            set.add(s.charAt(i++));
            max = Math.max(max, set.size());
        } 
        else {
//            set.remove(s.charAt(j++));
        	break;
        }
        System.out.println(set);
    }
    return max;
}
public static void main(String[] args) {
    String str = "abcabcbb";
    Set<Character> c = new HashSet<Character>();
    longSub sc = new longSub();
    System.out.println(sc.lengthOfLongestSubstring(str, c));
}
}