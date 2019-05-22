boolean almostIncreasingSequence(int[] sequence) {
    int counter = 0;
    int point = 0;
    
    for(int i = 0; i < sequence.length - 1; i++){
        
        if(sequence[i] > sequence[i+1] || sequence[i] == sequence[i+1]){
            counter++;
            if(i > 0 && i + 2 < sequence.length && sequence[i+1] <= sequence[i-1] &&
              sequence[i+2] <= sequence[i])
                counter++;
        }
    }
            
    if(counter > 1)
        return false;
    else 
        return true;
}
