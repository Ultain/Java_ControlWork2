package logic;

import java.util.List;

public class Content {

    public Content() {
    }

    public Content(long numberOfSentences, long numberOfWords, long numberOfPunctuationMarks, long numberOfSpaces, long numberOfVowels, long numberOfConsonants) {
        this.numberOfSentences = numberOfSentences;
        this.numberOfWords = numberOfWords;
        this.numberOfPunctuationMarks = numberOfPunctuationMarks;
        this.numberOfSpaces = numberOfSpaces;
        this.numberOfVowels = numberOfVowels;
        this.numberOfConsonants = numberOfConsonants;
    }

    private List<String> cyrillicText;
    private List<String> latinText;
    private long numberOfSentences;
    private long numberOfWords;
    private long numberOfPunctuationMarks;
    private long numberOfSpaces;
    private long numberOfVowels;
    private long numberOfConsonants;

}
