int[] alternatingSums(int[] a) {
    int[] teamOne = new int[a.length];
    int[] teamTwo = new int[a.length];
    int[] sum = new int[2];
    
    for(int i = 0, n = 0, m = 0; i < a.length; i++){
        if((i + 1) % 2 == 1){
            teamOne[n] = a[i];
            sum[0] += a[i];
            n++;
        }else{
            teamTwo[m] = a[i];
            sum[1] += a[i];
            m++;
        }
    }
    return sum;
}
