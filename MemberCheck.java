import java.util.*;
public class MemberCheck {
    public String[] whosDishonest(String[] club1, 
                                  String[] club2, 
                                  String[] club3) {
        Set<String> set = new LinkedHashSet<>();
        ArrayList<String> club22 = new ArrayList<>(Arrays.asList(club2));
        ArrayList<String> club33 = new ArrayList<>(Arrays.asList(club3));
        for (String str: club1){
            if (club22.contains(str)){
                set.add(str);
            }
            
        }
        for (String str: club2){
            if (club33.contains(str)){
                set.add(str);
            }
        }

        for (String str: club1){
            if (club33.contains(str)){
                set.add(str);
        }
    }

        String[] ret = new String[set.size()];
        int index = 0;
        for (String str: set){
            ret[index] = str;
            index++;
        }
        Arrays.sort(ret);
    return ret;  
    }
 }