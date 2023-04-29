public class IndexFirstOccurrenceString {
    class Solution {
        public int strStr(String h, String ne) {
            if(h.contains(ne)){
                int l1 = h.length();
                int l2 = ne.length();
                for(int i = 0; i < l1; i++){
                    int c = 0;
                    for(int j = 0; j < l2; j++){
                        if(h.charAt(i+j) == ne.charAt(j))
                            c++;
                    }
                    if(c == l2)
                        return i;
                }
            }
            return -1;
        }
    }
}
