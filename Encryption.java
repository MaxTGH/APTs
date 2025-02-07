import java.util.*;
public class Encryption {

    public String encrypt(String message){
        String[] mess = message.split("");
        
        String ret = "";
        char value = 'a';
        int index = 0;
        HashMap<String, String> map = new HashMap<>();
        for (String str: mess){
            if (!(map.containsKey(str))){
                value = (char)(value + index);
                String stri = Character.toString(value);
                map.put(str,stri);
                ret += stri;
            }
            else{
                ret+= map.get(str);
            }
            index = 1;
        }
        return ret;
    }
}