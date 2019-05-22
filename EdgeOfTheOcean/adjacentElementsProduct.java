int adjacentElementsProduct(int[] inputArray) {
    int j = 1;
    int max = inputArray[0] * inputArray[1];
    
    while(j < inputArray.length && (j + 1 < inputArray.length)){
        int check = inputArray[j] * inputArray[j + 1];
        if(check > max)
            max = check;
        j++;
    }
    return max;
}
