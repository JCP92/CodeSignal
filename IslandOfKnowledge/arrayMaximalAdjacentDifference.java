int arrayMaximalAdjacentDifference(int[] inputArray) {
    int max = 0;
    for(int i = 0; i < inputArray.length - 1; i++){
        int temp = Math.abs(inputArray[i] - inputArray[i + 1]);
        
        if( temp > max)
            max = temp; 
    }
    return max;
}
