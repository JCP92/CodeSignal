int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
    int n = 1, size = upSpeed;
    while(size < desiredHeight){
        size -= downSpeed;
        size +=upSpeed;
        n++;
    }
    
    return n;
}
