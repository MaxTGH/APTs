import java.util.*;

public class SortedFreqs {
    public  int[] freqs(String[] strings) {
        
        Map<String, Integer> frequencyMap = new TreeMap<>();
        for (String s : strings) {
            frequencyMap.putIfAbsent(s, 0);
            frequencyMap.put(s, frequencyMap.get(s) + 1);
        }
        int index = 0;
        int[] ret = new int[frequencyMap.size()];
        for (String s: frequencyMap.keySet()){
            ret[index] = frequencyMap.get(s);
            index++;
        }
        
        return ret;
        
 }
}
