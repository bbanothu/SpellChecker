
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class InputHelper {
    private DictionaryHelper dictionaryHelper;
    private SuggestionsHelper suggestionsHelper;

    public InputHelper(DictionaryHelper dictionaryHelper) {
        this.dictionaryHelper = dictionaryHelper;
        this.suggestionsHelper = new SuggestionsHelper(dictionaryHelper.getDictionary());
    }

    public void checkFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        int lineNumber = 0;

        while ((line = reader.readLine()) != null) {
            lineNumber++;
            String[] words = line.split("\\W+");
            int columnNumber = 0;

            for (String word : words) {
                columnNumber = line.indexOf(word, columnNumber);
                if (!dictionaryHelper.validatedWord(word) && !Character.isUpperCase(word.charAt(0))) {
                    List<String> suggestions = suggestionsHelper.suggestWords(word);
                    String highlightedLine = line.replace(word, "\u001B[1m" + word + "\u001B[0m");
                    System.out.println("Context: " + highlightedLine);
                    System.out.println("Incorrect word: " + word + " At Line: " + lineNumber + ", Column: " + (columnNumber + 1));
                    System.out.println("Suggestions: " + String.join(", ", suggestions));
                    System.out.println();
                }
            }
        }
        reader.close();
    }
}
