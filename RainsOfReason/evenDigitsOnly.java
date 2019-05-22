boolean evenDigitsOnly(int n) {
    int num = 0;
    
    do{
        num = n % 10;
        n /= 10;
        if(num % 2 != 0)
            return false;
    }while( n > 0 );
    
    return true;
}
