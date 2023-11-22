package projday7;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Pattern;

public class Encrypt {

	public int uniqueMorseRepresentation(String[] words) {
		String t[] = new String[]
				{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
				HashMap<Character, String> hh = new HashMap<Character, String>();
				int i=0;
				for(char c='a'; c<='z' &&i <26;c++,i++) {
					hh.put(c, t[i]);
				}
				String mcode="";
				HashSet<String> set = new HashSet<>();
				for(String word:words) {
					CharacterIterator it = new StringCharacterIterator(word);
					while(it.current() != CharacterIterator.DONE) {
						mcode += hh.get(it.current());
						it.next();
						
					}
					set.add(mcode);
					mcode="";
				}
				return set.size();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Encrypt ep = new Encrypt();
		String[] str = new String[] {"gin","zen","gog","msg"};
		System.out.println(ep.uniqueMorseRepresentation(str));
	}

}
