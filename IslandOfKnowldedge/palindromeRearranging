boolean palindromeRearranging(String inputString) {
    int[] alphabet = new int[26];
    Arrays.fill(alphabet, 0);
    
    int odds = 0;
    for(int i = 0; i < inputString.length(); i++){
        alphabet[(int)inputString.charAt(i) - (int)('a')]++;
    }
    
    for(int i = 0; i < alphabet.length; i++){
        if(alphabet[i] % 2 == 1)
            odds++;
    }
    if(inputString.length() % 2 == 0){
        if(odds > 0)
            return false;
    }else
        if(odds != 1)
            return false;
    return true;
}
