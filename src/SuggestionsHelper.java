import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SuggestionsHelper {
    private Set<String> dictionary;

    public SuggestionsHelper(Set<String> dictionary) {
        this.dictionary = dictionary;
    }

    public List<String> suggestWords(String incorrectWord) {
        List<String> suggestions = new ArrayList<>();
        int minDistance = Integer.MAX_VALUE;

        for (String dictWord : dictionary) {
            int distance = dpSuggestedWord(incorrectWord.toLowerCase(), dictWord);
            if (distance < minDistance) {
                suggestions.clear();
                suggestions.add(dictWord);
                minDistance = distance;
            } else if (distance == minDistance) {
                suggestions.add(dictWord);
            }
        }

        return suggestions;
    }

    private int dpSuggestedWord(String word1, String word2) {
        int[][] dp = new int[word1.length() + 1][word2.length() + 1];

        for (int i = 0; i <= word1.length(); i++) {
            for (int j = 0; j <= word2.length(); j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j - 1] + (word1.charAt(i - 1) == word2.charAt(j - 1) ? 0 : 1),
                            Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1));
                }
            }
        }
        return dp[word1.length()][word2.length()];
    }
}
