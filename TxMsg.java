public class TxMsg {
    public String getMessage(String original) {
        String[] words = original.split(" ");
        for (int k = 0; k<words.length; k++)
        {
            String r = changeIt(words[k]);
            words[k] = r;
        }
        
        return String.join(" ",words);
        
    }

    private boolean isVowel(char ch)
    {
        return "aeiou".indexOf(ch) >=0;
    }

    private boolean isConsonant(char ch)
    {
        return !isVowel(ch);
    }
    private String changeIt(String s) {
        
        if (allVowels(s)) return s;
        String ret = "";
        if (isConsonant(s.charAt(0)))
        {
            ret+=s.charAt(0);
        }
        for (int k = 1; k<s.length(); k++)
        {
            char ch = s.charAt(k);
            char before = s.charAt(k-1);
            if (isConsonant(ch) && isVowel(before))
            {
                ret += ch;
            }
        }
        return ret;
    }

    private boolean allVowels(String s) {
        for (char ch: s.toCharArray())
        {
            if (isConsonant(ch)){
                return false;
            }
        }
        return true;
    }
 }