import java.util.*;
public class Common {
    public int count (String a, String b) {
        int count = 0;
        String[] lettersA = a.split("");
        String[] lettersB = b.split("");
        ArrayList<String> malleable = new ArrayList<>(Arrays.asList(lettersB));
        for (String letter: lettersA)
        {
            if (malleable.contains(letter))
            {
                count +=1;
                int index = malleable.indexOf(letter);
                malleable.remove(index);
            }
        }
        return count;
    }
 }