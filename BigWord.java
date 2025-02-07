import java.util.*;

public class BigWord {
    public String most(String[] sentences) {
        ArrayList<String> list = new ArrayList<>();
        for (String s:sentences) {
            String[] all = s.toLowerCase().split(" ");
            list.addAll(Arrays.asList(all));
        }

        int maxCount = 0;
        String maxString = "";
        for (String word: list){
            int x = count(list,word);
            if (x > maxCount){
                maxCount = x;
                maxString = word;
            }

            
        }
        return maxString;
    }

    private int count(ArrayList<String> list, String word) {
        int total = 0;
        for (String s: list){
            if (s.equals(word)){
                total +=1;
            }
        }
        return total;
    }
}