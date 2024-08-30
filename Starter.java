import java.util.HashSet;
public class Starter {
    public int begins(String[] words, String first) {
        int count = 0;        
        HashSet<String> repeat = new HashSet<String>();
        for (String word:words)
        {
            String[] wordSplit = word.split("");
            if (wordSplit[0].equals(first))
            {
                Boolean bool = true;
                for (String rep: repeat)
                {
                    if (word.equals(rep))
                    {
                        bool = false;
                    }
                }
                if (bool)
                {
                    count +=1;
                    repeat.add(word);
                }
            
        }
            
        }
        return count;
    }
}