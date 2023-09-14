class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int len;
        boolean side1;
        String newString = "";

        if (word1.length() >= word2.length()){
            len = word2.length();
            side1 = true;
        } else {
            len = word1.length();
            side1 = false;
        }

        for (int i = 0; i < len; i++) {
            newString += word1.charAt(i);
            newString += word2.charAt(i);
        }

        if (side1) {
            newString += word1.substring(len);
        } else {
            newString += word2.substring(len);
        }

    return newString;
    }
}