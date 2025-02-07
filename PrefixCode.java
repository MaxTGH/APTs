public class PrefixCode { 
    public String isOne(String[] words) {
        int index = 0;
        for (String word1: words){
            String[] initialWord = word1.split(""); 
            for (String word2: words){
                String[] compareWord = word2.split("");
                boolean equal = false;
                outerloop:
                for (int i = 0; i < initialWord.length; i++){                    if (!(word1.equals(word2)) && !(word1.length() > word2.length())){
                        if ((initialWord[i].equals(compareWord[i]))){
                            equal = true;
                        }
                        else{
                            equal = false; 
                            break outerloop;
                        }
                        }
                    
                    }
                    if (equal){
                        return "No, " + index;
        
                }   
            }
            index++;
    }
    return "Yes";
 }
}