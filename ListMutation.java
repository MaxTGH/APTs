public class ListMutation {
    public ListNode alter(ListNode list) {
        ListNode first = new ListNode(-1);
        ListNode last = first;
        while (list != null){
            if (list.info % 2 == 0){
                ListNode temp = new ListNode(list.info);
                temp.next = new ListNode(list.info);
                last.next = temp;
                last = last.next.next;
            }
            list = list.next;
        }
        return first.next; 
    }
    
}
