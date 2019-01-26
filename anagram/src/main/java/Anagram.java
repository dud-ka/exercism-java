import java.util.ArrayList;
import java.util.List;

public class Anagram {
	String word;

	public Anagram(String word) {
		this.word = word;
	}

	public List<String> match(List<String> list) {
		List<String> resultListOfAnagrams = new ArrayList<>();
		char[] wordToChars = word.toLowerCase().toCharArray();

		for(String listElem : list) {
			if (listElem.length() == word.length()) {
				String listElemLowerCase = listElem.toLowerCase();
				char[] listElemChars = listElemLowerCase.toCharArray();

				if(!listElemLowerCase.equals(word.toLowerCase())) {

					for (int i = 0; i < wordToChars.length; i++) {
						for (int j = 0; j < listElemChars.length; j++) {
							if (listElemChars[j] == wordToChars[i]) {
								listElemChars[j] = 0;
								break;
							}
						}
					}
					if (isAllCharsZero(listElemChars)) {
						resultListOfAnagrams.add(listElem);
					}
				}
			}
		}
		return resultListOfAnagrams;
	}

	public boolean isAllCharsZero (char[] charArray) {
		for(int i = 0; i < charArray.length; i++) {
			if (charArray[i] != 0) {
				return false;
			}
		}
		return true;
	}
}

