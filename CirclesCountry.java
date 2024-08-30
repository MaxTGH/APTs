package APTs;
public class CirclesCountry 
{
    public int leastBorders(int[] x, int[] y, int[] r, 
                            int x1, int y1, int x2, int y2) 
    {
        int count = 0;
        int[] circleDim = {0,0,0};
        for (int i = 0; i < x.length; i++)  
        {
            boolean firstIn = false;
            boolean secondIn = false;
            circleDim[0] = x[i]; //x coord
            circleDim[1] = y[i]; //y coord
            circleDim[2] = r[i]; //radius
            //(x-x0)^2 + (y-y0)^2 < r^2
            firstIn = ((Math.pow((x1-circleDim[0]),2) + (Math.pow((y1-circleDim[1]),2))) < Math.pow(circleDim[2],2));
            secondIn = ((Math.pow((x2-circleDim[0]),2) + (Math.pow((y2-circleDim[1]),2))) < Math.pow(circleDim[2],2));
            if (firstIn ^ secondIn)
            {
                count+=1;
            }
        }
        return count;
        

    }
 }