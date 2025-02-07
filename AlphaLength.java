import java.util.*;
public class AlphaLength {
    public ListNode create (String[] words) {
        Set<String> set = new HashSet<>();
        for (String word: words){
            set.add(word);
        }
        String[] array = new String[set.size()];
        int j = 0;
        for (String word: set){
            array[j] = word;
            j++;
        }
        Arrays.sort(array);
        ListNode first = new ListNode(array[0].length());
        ListNode temp = first;
        
        for (int i = 1; i < array.length ; i++){
            first.next = new ListNode(array[i].length());
            first = first.next; 
        }
            

    return temp;
    }
}