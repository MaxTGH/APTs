import java.util.*;
public class Anonymous {
    private Map<Character, Integer> map = new HashMap<>();
    public int howMany(String[] headlines, String[] mess){
        countChars(headlines);
        int total = 0;
        for(String m: mess) {
            if (canMake(m)){
                total+=1;
            }
        }
        return total;
    }

    private boolean canMake(String m) {
        Map<Character,Integer> messMap = new HashMap<>();
        for (char ch: m.toLowerCase().toCharArray()){
            messMap.put(ch, messMap.getOrDefault(ch,0) +1);
        }

        for(char ch: messMap.keySet()){
            if(ch ==' ') continue;
            if (messMap.get(ch) > map.getOrDefault(ch,0)){
                return false;
            }
        }
        return true;
    }

    public void countChars(String[] headlines) {
        for (String s: headlines) {
            for(char ch: s.toLowerCase().toCharArray()){
                map.putIfAbsent(ch,0);
                map.put(ch,map.get(ch)+1);
                }
            }
        }
    }

