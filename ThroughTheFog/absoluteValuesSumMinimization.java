int absoluteValuesSumMinimization(int[] a) {
    int sumMin = Integer.MAX_VALUE;
    int val = 0;
    
    for(int i = 0; i < a.length;  i++){
        int temp = 0;
        for(int j = 0; j < a.length; j++){
            temp += Math.abs(a[j] - a[i]);
        }
        if(temp < sumMin){
            sumMin = temp;
            val = a[i];
        }
    }
    return val;
}
