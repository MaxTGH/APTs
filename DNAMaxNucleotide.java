public class DNAMaxNucleotide {
    public String max(String[] strands, String nuc) {
        String correctStrand = "";
        int maxCount = 1;
        for (String strand: strands)
        {
            int count = 0;
            String[] splitStrand = strand.split("");
            for (String nucleotide: splitStrand )
            {
                if (nucleotide.equals(nuc))
                {
                    count+=1;
                }
            }
            if (count > maxCount)
            {
                maxCount = count;
                correctStrand = strand;
            }
            if (count == maxCount)
            {
                if (strand.length() > correctStrand.length())
                {
                    correctStrand=strand;
            }
        }
        }
        
        return (correctStrand);

    }
 }
