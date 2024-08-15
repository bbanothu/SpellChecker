# Instructions
javac DictionaryHelper.java InputHelper.java SugesstionsHelper.java SpellChecker.java
java SpellChecker dictionary.txt text1.txt | I made 7 auto generated test files to test different cases

If you use eclipse, you can also add to the program arguments dictionary.txt text1.txt and run from there. 

EX. Output is as follows for test case 1
Context: The quick [1mbrownn[0m fox jumps over the lazi dog.
Incorrect word: brownn At Line: 1, Column: 11
Suggestions: browns, browny, brown

Context: The quick brownn fox jumps over the [1mlazi[0m dog.
Incorrect word: lazi At Line: 1, Column: 37
Suggestions: lari, lati, lazy, laze, nazi

Context: Spell checking is [1mesential[0m for good writing.
Incorrect word: esential At Line: 2, Column: 19
Suggestions: essential

Context: Misspelled words include [1mapplle[0m, bannana, and graape.
Incorrect word: applle At Line: 4, Column: 26
Suggestions: apple

Context: Misspelled words include applle, [1mbannana[0m, and graape.
Incorrect word: bannana At Line: 4, Column: 34
Suggestions: bandana, banana

Context: Misspelled words include applle, bannana, and [1mgraape[0m.
Incorrect word: graape At Line: 4, Column: 47
Suggestions: grape.




# Make a spell checker!
Write a program that checks spelling. The input to the program is a dictionary file containing a list of valid words and a file containing the text to be checked.

The program should run on the command line like so:

```text
<path to your program> dictionary.txt file-to-check.txt
# output here
```

Your program should support the following features (time permitting):

- The program outputs a list of incorrectly spelled words.
- For each misspelled word, the program outputs a list of suggested words.
- The program includes the line and column number of the misspelled word.
- The program prints the misspelled word along with some surrounding context.
- The program handles proper nouns (person or place names, for example) correctly.


## Additional information

- The formatting of the output is up to you, but make it easy to understand.
- The dictionary file (`dictionary.txt` in the example above) is always a plain text file with one word per line.
- You can use the `dictionary.txt` file included in this directory as your dictionary.
- The input file (`file-to-check.txt` in the example above) is a plain text file that may contain full sentences and paragraphs.
- You should come up with your own content to run through the spell checker.
- Use any programming language, but extra credit for using Java or Kotlin.
- Feel free to fork the repo and put your code in there or create a new blank repo and put your code in there instead.
- Send us a link to your code and include instructions for how to build and run it.
- Someone from Voze will review the code with you, so be prepared to discuss your code.
