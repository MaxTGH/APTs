public class ComboList {
    public ListNode combine(String[] list) {
        ListNode listN = null;
        for (int j = list.length -1; j >= 0; j--){
            
            String[] val = list[j].split(",");

            
            if (val.length %2 == 0)
            {
                listN = new ListNode(Integer.parseInt(val[val.length-1]), listN);
                for (int i = val.length-2; i >=0; i--){
                    listN = new ListNode(Integer.parseInt(val[i]), listN);
                }
            }
            if (val.length %2 == 1)
            {
                listN = new ListNode(Integer.parseInt(val[0]), listN);
                for (int i = 1; i < val.length; i++){
                    listN = new ListNode(Integer.parseInt(val[i]), listN);
                }
            }
        }
        return listN;
        
    }
}