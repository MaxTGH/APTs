import java.util.*;

public class MedalTable {
    public class Medals{
        String country;
        int gold;
        int silver;
        int bronze;
        Medals(String s){
            country = s;
        }
        public int getGold(){
            return gold;
        }
        public int getSilver(){
            return silver;
        }
        public int getBronze(){
            return bronze;
        }
        public String getName(){
            return country;
        }
        public String toString(){
            return country + " " + gold + " " + silver + " " + bronze;
        }
    }
    
    public  String[] generate(String[] results) {
        Map<String, Medals> map = new HashMap<>();
        for (String event: results){
            String[] arr = event.split(" ");
            for (String str: arr){
                map.putIfAbsent(str, new Medals(str));

            }
            map.get(arr[0]).gold +=1;
            map.get(arr[1]).silver +=1;
            map.get(arr[2]).bronze +=1;

        }
        ArrayList<Medals> list = new ArrayList<>(map.values());
        
        Comparator<Medals> goldComp = Comparator.comparing(Medals::getGold);
        Comparator<Medals> silverComp = Comparator.comparing(Medals::getSilver);
        Comparator<Medals> bronzeComp = Comparator.comparing(Medals::getBronze);
        Comparator<Medals> nameComp = Comparator.comparing(Medals::getName);
        
        Collections.sort(list, nameComp);
        Collections.sort(list, bronzeComp.reversed());
        
        Collections.sort(list, silverComp.reversed());
        Collections.sort(list, goldComp.reversed());

        ArrayList<String> ret = new ArrayList<>();
        
        for (Medals medal: list){
            ret.add(medal.toString());
        }
        String[] retFinal = new String[ret.size()];
        int i = 0;
        for (String str: ret){
            retFinal[i] = str;
            i++;
        }
        return retFinal;
        
        }
        
 }

