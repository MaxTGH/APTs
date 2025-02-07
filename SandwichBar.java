import java.util.*;

 public class SandwichBar {
     public int whichOrder(String[] available, String[] orders){
         int index = -1;
         for (int i = 0; i< orders.length; i++)
         {
            ArrayList<String> ingredientsChange = new ArrayList<>(Arrays.asList(available));
             boolean enough = false;
             String[] ingredientsWanted = orders[i].split(" ");
             for (String ingredients: ingredientsWanted)
             {
                if (ingredientsChange.contains(ingredients))
                {
                    enough = true;
                }
                else
                {
                    enough = false;
                    break;
                }
                
                    
             }
             if (enough)
             {
                index = i;
                break;
             }
 
        }
        return index; 
     }
  }
 
