package HomeWork6;

import java.io.IOException;
import java.net.URISyntaxException;

public interface ISearchEngine {
    /**
     * @param text this is the text where we are looking
     * @param word this is the word that we find
     * @return the number of times a word occurs in the text
     */
    long search (String text, String word) throws IOException, URISyntaxException;
}
