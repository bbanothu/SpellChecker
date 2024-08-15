import java.io.IOException;

public class SpellChecker {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java SpellChecker <dictionary file> <file to check>");
            return;
        }

        try {
            DictionaryHelper dictionaryManager = new DictionaryHelper(args[0]);
            InputHelper fileParser = new InputHelper(dictionaryManager);
            fileParser.checkFile(args[1]);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
