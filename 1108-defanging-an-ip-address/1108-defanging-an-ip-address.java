class Solution {
    public String defangIPaddr(String address) {
        
        String newIP = "";

        for (int i = 0; i < address.length(); i++){
            if (address.charAt(i) == '.'){
                newIP += "[.]";
            } else {
                newIP += address.charAt(i); 
            }
        }
    return newIP;
    }
}