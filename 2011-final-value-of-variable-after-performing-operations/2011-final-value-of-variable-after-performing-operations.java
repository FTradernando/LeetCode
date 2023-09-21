class Solution {
    public int finalValueAfterOperations(String[] operations) {    

        int y = 0;

        for (String x : operations){
            if (x.equals("++X") || x.equals("X++")){
                y++;
                continue;
            } 
            y--;
        }
    return y;
    }
}