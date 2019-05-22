int shapeArea(int n) {
    int sum = 1;
    if(n == 0){
        return 0;
    }else if(n == 1)
        return sum;
    else{
        for(int i = 1; i < n; i++){
            sum += 4 * i;
        }   
    }
    return sum;
}
