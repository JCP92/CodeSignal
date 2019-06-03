int digitDegree(int n) {
    int i = 0;
    
    while( n >= 10){
        n = getCondensedDigit(n);
        i++;
    }
    
    return i;
}
              
int getCondensedDigit(int n){
    int i = 0;
    while( n != 0){
        i += (n % 10);
        n /= 10;
    }
    return i;
}
