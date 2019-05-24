boolean stringsRearrangement(String[] inputArray) {
    boolean success = false;
    boolean[] tested = new boolean[inputArray.length];
    
    if(duplicates(inputArray) && inputArray.length == 2)
        return false;
    
    return findSequence(inputArray, null, tested, 0, success);
}

boolean findSequence(String[] inputArray, String prevWord, boolean[] tested, int nav, boolean success) {
    if (nav == inputArray.length) {
        success = true;
        return success;
    }
    for (int i = 0; i < inputArray.length; i++) {
        if (!tested[i] && (prevWord == null || testPairs(prevWord, inputArray[i]))) {
            tested[i] = true;
            success = findSequence(inputArray, inputArray[i], tested, nav + 1, success);
            tested[i] = false;
        }
    }
    return success;
}
public boolean duplicates(String[] inputArray){
    for(int i = 0; i < inputArray.length - 1; i++)
        for(int j = i + 1; j < inputArray.length; j++)
            if(inputArray[i].equals(inputArray[j]))
                return true;
    return false;
}
