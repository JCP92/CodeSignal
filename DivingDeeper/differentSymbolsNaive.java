int differentSymbolsNaive(String s) {
    int[] alphabet = new int[26];
    int difAlph = 0;
    for(int i = 0; i < s.length(); i++){
        int index = (int)s.charAt(i) - (int)'a';
        if(alphabet[index] == 0){
            alphabet[index] = 1;
            difAlph++;
        }
    }
    
    
    return difAlph;
}
