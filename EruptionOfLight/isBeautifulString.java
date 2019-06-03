boolean isBeautifulString(String inputString) {
    int[] alphabet = new int[26];
    Arrays.fill(alphabet, 0);

    for(int i = 0; i < inputString.length(); i++){
        int num = (int)inputString.charAt(i) - (int)'a';
        alphabet[num]++;
    }
    
    for(int i = 1; i < alphabet.length; i++){
        if(alphabet[i - 1] < alphabet[i])
            return false;
    }
    

    return true;
}

