import java.util.*;
 public class EZSort {
        public String[] sort(String[] list){
            Arrays.sort(list);

            Arrays.sort(list, (a,b) -> count(b) - count(a));
                        return list;
            }
            
        private int count(String a) {
            int num = 0;
            String[] arr = a.split("");
            for (String b: arr){
                if (b.equals("e") || b.equals("z")){
                    num +=1;
                }
            }
            return num;
        }

        
    }