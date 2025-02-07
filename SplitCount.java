import java.util.*;
public class SplitCount {
    public String counter(String[] info) {
        String ret = "";
        int max = 0;
        Map<String, Integer> map = new HashMap<>();
        for (String str: info){
            String[] split = str.split(":");
            for (String s: split){
                map.putIfAbsent(s, 0);
                map.put(s, map.get(s) + 1);
            }
        }

        for (String key: map.keySet()){
            if (map.get(key) > max){
                ret = key;
                max = map.get(key);
            }
        }
        return ret;
    }
}