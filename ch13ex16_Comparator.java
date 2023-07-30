import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;


public class WordCountComparator implements Comparator<String> {

    public int compare(String s1, String s2) {
        int wordCount1 = countWords(s1);
        int wordCount2 = countWords(s2);

        return Integer.compare(wordCount1, wordCount2);
    }

    private int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int wordCount = 0;
        boolean isWord = false;

        for (char c : str.toCharArray()) {
            if (Character.isWhitespace(c)) {
                isWord = false;
            } else if (!isWord) {
                wordCount++;
                isWord = true;
            }
        }

        return wordCount;
    }
}

