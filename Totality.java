public class Totality {
    public int sum(int[] a, String stype) {
        int ret= 0;
        for (int i=0; i < a.length; i++)
        {
            if ((stype.equals("even"))&&(i%2==0))
            {
                ret+= a[i];
            }
            if (stype.equals("odd")&&(i%2==1))
            {
                ret+=a[i];
            }
            if (stype.equals("all"))
            {
                ret+=a[i];
            }
        }
        return ret;
    }
}