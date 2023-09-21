class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int n = 1; 

        for (String x : sentences){
            int newN = 1;
            for (int i = 0; i < x.length(); i++){
                if (x.charAt(i) == ' '){
                    newN++;
                }
            }
            if (newN > n){
                n = newN;
            }
        }
    return n;
    }
}