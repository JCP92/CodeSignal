boolean checkPalindrome(String inputString) {
    
    for(int i = 0, j = inputString.length() - 1; (i != j) && (i < j); i++, j--){
        if((int)inputString.charAt(i) != (int)inputString.charAt(j)){
            return false;
        }
    }
    return true;
}
