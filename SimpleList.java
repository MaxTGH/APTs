public class SimpleList {
    public ListNode listerize(String values) {
        String[] val = values.split(",");

        ListNode list = new ListNode(Integer.parseInt(val[val.length-1]));
        for (int i = val.length-2; i >=0; i--){
            list = new ListNode(Integer.parseInt(val[i]), list);
        }
        return list;
    }
}