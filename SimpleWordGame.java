import java.util.*;
public class SimpleWordGame {
    public int points(String[] player, String[] dictionary) 
    {
        int count = 0;
        HashSet<String> words = new HashSet<>(Arrays.asList(player));
        for (String word: words)
        {
            if (inDictionary(word, dictionary))
            {
                count+= (word.length() * word.length());
            }
        }
        return count;
    }

    private boolean inDictionary(String word, String[] dictionary) {
        for (String elt: dictionary)
        {
            if (elt.equals(word))
            return true;
        }
        return false;
    }
}