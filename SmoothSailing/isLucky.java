boolean isLucky(int n) {
    String num = Integer.toString(n);
    int mid = num.length() / 2;
    int length = num.length() - 1;
    
    int firstHalf = Integer.parseInt(num.substring(0, mid));
    int secondHalf = Integer.parseInt(num.substring(mid, length + 1));
    
    int sum1 = 0;
    int sum2 = 0;
    
    for(int i = 0; i < mid; i++){
        
        sum1 += (firstHalf % 10);
        firstHalf /= 10;
        
        sum2 += (secondHalf % 10);
        secondHalf /= 10;
    }
    
    if(sum1 == sum2)
        return true;
    else
        return false;
}
