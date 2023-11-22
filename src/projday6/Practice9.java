package projday6;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.HashMap;
import java.util.HashSet;

public class Practice9 {
	public int uniqueMorseRepresentations(String[] words) {
		String temp[] = new String[]
				{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
				HashMap<Character,String> morse = new HashMap<>();
				int i = 0;
				for(char c = 'a'; c<='z' && i<26; c++,i++) {
					morse.put(c, temp[i]);
				}
				String morseCode = "";
				HashSet<String> set = new HashSet<>();
				for(String word: words) {
					CharacterIterator it = new StringCharacterIterator(word);
					while(it.current() != CharacterIterator.DONE) {
					morseCode += morse.get(it.current());
					it.next();
				}
					set.add(morseCode);
					morseCode = "";
				}
				return set.size();	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Practice9 ep = new Practice9();
		String[] str = new String[] {"gin", "zen", "gig", "msg"};
		System.out.println(ep.uniqueMorseRepresentations(str));
	}

}
