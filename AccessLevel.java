public class AccessLevel {
    public String canAccess(int[] rights, int minPermission) {
        String ret = "";
        for (int k:rights)
        {
            if (k>=minPermission)
            {
                ret+="A";
            }
            else
            {
                ret+="D";
            }
        }
        return ret; 
    }
 }