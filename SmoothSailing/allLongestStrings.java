String[] allLongestStrings(String[] inputArray) {
    
    int longestString = 0;
    int n = 0;
    
    for(int i = 0; i < inputArray.length; i++){
        if(longestString < inputArray[i].length()){
            n = 0;
            longestString = inputArray[i].length();
        }
        if(longestString == inputArray[i].length())
            n++;
    }
    
    String[] longArray = new String[n];
    for(int i = 0, j = 0; i < inputArray.length; i++){
        if(longestString == inputArray[i].length()){
            longArray[j] = inputArray[i];
            j++;
        }
    }
    return longArray;
}
