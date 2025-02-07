import java.util.*;

public class SortByFreqs {
    public class Pair implements Comparable<Pair>{
        String word;
        int frequency;
        Pair(String s, int b){
            this.word = s;
            this.frequency = b;
        }
        @Override
        public int compareTo(SortByFreqs.Pair o) {
            int diff = frequency - o.frequency;
            if (diff != 0){
                return diff * -1;
            }
            return word.compareTo(o.word);
        }
        

    }
    
    public  String[] sort(String[] strings) {
        
        Map<String, Integer> frequencyMap = new TreeMap<>();
        for (String s : strings) {
            frequencyMap.putIfAbsent(s, 0);
            frequencyMap.put(s, frequencyMap.get(s) + 1);
        }
        ArrayList<Pair> list = new ArrayList<>();
        for (String s: frequencyMap.keySet()){
            list.add(new Pair(s, frequencyMap.get(s)));

        }
        Collections.sort(list);

        String[] ret = new String[list.size()];
        int index = 0;
        for (Pair p: list){
            ret[index] = p.word;
            index++;
        }
        return ret;
        
 }
}
