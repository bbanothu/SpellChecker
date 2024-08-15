import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class DictionaryHelper {
    private Set<String> dictionary;

    public DictionaryHelper(String dictionaryFilePath) throws IOException {
        dictionary = new HashSet<>();
        loadDictionary(dictionaryFilePath);
    }

    private void loadDictionary(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String word;
        while ((word = reader.readLine()) != null) {
            dictionary.add(word.toLowerCase());
        }
        reader.close();
    }

    public Set<String> getDictionary() {
        return dictionary;
    }
    
    public boolean validatedWord(String word) {
        return dictionary.contains(word.toLowerCase());
    }
}
