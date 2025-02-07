import java.util.*;
public class IsomorphicWords
{
    public int countPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isomorphic(words[i], words[j])) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isomorphic(String string, String string2) {
        
        HashMap<String, String> map = new HashMap<>();

        String[] str1 = string.split("");
        String[] str2 = string2.split("");

        for (int i =0; i < str1.length; i++)
        {
            boolean valuePresent = map.containsValue(str2[i]);
            boolean keyPresent = map.containsKey(str1[i]);
            if (!(keyPresent)){
                if (valuePresent){
                    return false;
                }
                map.put(str1[i], str2[i]);
            }
            else{
                if (!map.get(str1[i]).equals(str2[i])){ ///
                    return false;
                }
            }
        }
        return true;
        }
        

        
    }

