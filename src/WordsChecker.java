import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    private final Set<String> wordsHashSet = new HashSet<>();

    public WordsChecker(String text) {
        Collections.addAll(wordsHashSet, text.split("\\P{IsAlphabetic}+"));
    }

    public boolean hasWord(String s) {
        return wordsHashSet.contains(s);
    }
}
