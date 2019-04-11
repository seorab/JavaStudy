package ch18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class WordCount {
	// Shift + Ctrl + O
	public static void main(String[] args) {
		StringBuffer text = new StringBuffer();
		text.append("Python is an easy to learn, powerful programming language. ");
		text.append("It has efficient high-level data structures and a simple ");
		text.append("but effective approach to object-oriented programming. ");
		text.append("Python¡¯s elegant syntax and dynamic typing, ");
		text.append("together with its interpreted nature, ");
		text.append("make it an ideal language for scripting and ");
		text.append("rapid application development in many areas on most platforms.");

		String[] words = text.toString().split(" ");

		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		for (String word : words) {
			boolean isContain = wordMap.containsKey(word);
			int count = 1;
			if (isContain) {
				count = wordMap.get(word);
				wordMap.put(word, ++count);
			}
			wordMap.put(word, count);
		}

		Set<String> keys = wordMap.keySet();
		Iterator<String> iter = keys.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			int value = wordMap.get(key);
			System.out.println(key + " :: " + value);
		}
	}
}