public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize) {
        long cluster = 0;
        for (int size: sizes){
            if ((!(size == 0)) && !(size%clusterSize == 0)){
                cluster += (((int)(size/clusterSize))+1);
            }
            else {
                cluster += size/clusterSize;
            }
            

        }
        return (cluster*clusterSize);
    }
 }