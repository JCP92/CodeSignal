int avoidObstacles(int[] inputArray) {
    int i = 1, move = 0; 
    boolean success = false;
    Arrays.sort(inputArray);
    int max = inputArray[inputArray.length - 1];
    
    do{ 
        i++;
        if(check(inputArray, i, max)){
            return i;  
        }
    }while(!success);
    
    return i;
}

public boolean check(int[] ar, int i, int max){
    int move = 0;
    while(move < max){ 
        move += i;
        for(int j = 0; j < ar.length; j++){
            if(move == ar[j]){
                return false;
            }
        }
    }
    return true;
}
