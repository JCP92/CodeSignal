int arrayChange(int[] inputArray) {
    int count = 0;
    for(int i = 0; i < inputArray.length - 1; i++){
        if(inputArray[i] >= inputArray[i+1]){
            int temp = (inputArray[i] - inputArray[i+1]) + 1;
            inputArray[i + 1] += temp;
            count += temp;
        }
    }
    return count;
}
