import java.util.*;
public class Closet {
    public String anywhere(String[] list) {
        Set<String> uniqueWords = new HashSet<>();
        for (String sentence : list) {
            String[] words = sentence.split(" ");
            for (String word : words) {
                uniqueWords.add(word);
            }
        }
        List<String> sortedWords = new ArrayList<>(uniqueWords);
        Collections.sort(sortedWords);
        String ret = "";
        for (String str: sortedWords){
            ret += str + " ";
        }

        return ret.trim();
}
        
}

