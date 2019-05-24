int[] extractEachKth(int[] inputArray, int k) {
    int[] removed = new int[inputArray.length];
    int j = 0;
    
    for(int i = 0; i < inputArray.length; i++){
        if( !isKth(i, k) ) {
            removed[j] = inputArray[i];
            j++;
        }    
    }
    
    int[] newArray = new int[j];
    for(int i = 0; i < newArray.length; i++)
        newArray[i] = removed[i];
    return newArray;
}
boolean isKth(int i, int k){
    int check = k - 1;
    for(int n = 1; i > check; n++){
        check = (n * k) - 1;
    }
    return i == check;
}
