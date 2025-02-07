public class PairDown {
    public int[] fold(int[] list) {
        int length = 0;
        if (list.length % 2 ==0)
        {
            length = list.length/2;
        }
        else{
            length = (list.length/2) + 1;
        }
        int[] ret = new int[length];
        for (int i = 0; i < list.length; i = i+2){
            if (i + 1 < list.length) {
                ret[i / 2] = list[i] + list[i + 1];
            } 
            else {
                ret[i / 2] = list[i];
        }

    }
    return ret;
}
}