import java.util.*;

public class StringCuts {
    public String[] filter(String[] list, int minLength) {
        List<String> set1 = new ArrayList<>();
        int k = 0;
        for (String str: list){
            if (str.length() >= minLength && !(set1.contains(str))){
                set1.add(k,str);
                k++;
            }
        }
        String[] ret = new String[set1.size()];
        int i = 0;
        for (String str: set1){
            ret[i] = str;
            i++;
        }
        return ret;
    }
}