class Solution {
    public String interpret(String command) {
        
        String newString = "";

        for(int i = 0; i < command.length(); i++){
            char newChar = command.charAt(i);

            switch (newChar){

            case 'G':  
                newString += "G";
                break;
            case '(':  
                if (command.charAt(i+1) == ')'){
                    newString += "o";
                    break;
                } else {
                    newString += "al";
                    break;
                }
            default:
                break; 
            }
        }
    return newString;
    }
}