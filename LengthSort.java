import java.util.*;

public class LengthSort{
    public String[] rearrange(String[] values){
        Arrays.sort(values, Comparator.comparing(String::length).thenComparing(String::compareTo));
        return values;
    }
}