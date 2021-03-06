package HomeWork5;

import java.io.IOException;
import java.net.URISyntaxException;

public interface ISearchEngine {
    /**
     * @param text the path to the text in which we are looking
     * @param word this is the word that we find
     * @return the number of times a word occurs in the text
     */
    long search (String text, String word) throws IOException, URISyntaxException;
}
