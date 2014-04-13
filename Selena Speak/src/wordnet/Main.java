package wordnet;

import java.util.HashSet;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("wordnet.database.dir", "C:\\Program Files (x86)\\WordNet\\2.1\\dict");
		HashSet<String> words = WordNet.getSisterTerms("expensive", "noun");
		for(String word : words)
			System.out.println(word);
	}
}
