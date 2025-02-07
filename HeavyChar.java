import java.util.*;

public class HeavyChar {
    public String[] weight(String[] words,
                           String letter,
                           int minChars){
        List<String> list = new ArrayList<>();

        for (String word: words){
            if (count(word, letter) > minChars){
                list.add(word);
            }
        }
        
        String[] ret = new String[list.size()];
        int i = 0;
        for (String s: list){
            ret[i] = s;
            i++;
        }

        
        return ret;
    }

    private int count(String word, String letter) {
        int count = 0;
        String[] wordSplit = word.split("");
        for (String str: wordSplit){
            if (str.equals(letter)){
                count +=1;
            }
        }
        return count;



        }
    }

