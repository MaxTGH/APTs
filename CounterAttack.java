import java.util.*;
public class CounterAttack {
    public int[] analyze(String str, String[] words) {
        int[] ret = new int[words.length];
        String[] w = str.split(" ");
        ArrayList<String> aw = new ArrayList<>(Arrays.asList(w));
        for (int k = 0;k <words.length; k++)
        {
            int fr = Collections.frequency(aw, words[k]);
            ret[k] = fr;
        }
        return ret;
    }

    public int[] analyze2(String str, String[] words) {
        int[] ret = new int[words.length];
        String[] a = str.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for (String s: a) {
            if (!map.containsKey(s)){
                map.put(s,0);

            }
            map.put(s, map.get(s) + 1);
        }
        for (int k =0; k<words.length; k++)
        {
            int fr = map.getOrDefault(words[k],0);
            ret[k] = fr;

        }
        return ret;
    }
}