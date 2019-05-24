int arrayMaxConsecutiveSum(int[] inputArray, int k) {
    int num = 0;
    int stop = inputArray.length - (k - 1);
    for(int i = 0; i < stop; i++){
        int temp = 0;
        for(int j = i; j < i + k; j++){
            temp += inputArray[j];
        }
        if(temp > num)
                num = temp; 
    }
    return num;
}

/*int helper(int[] a, int i, int k){
    if(k == 0)
        return 0;
    return a[i] + helper(a, i + 1, k - 1);
}
*/
