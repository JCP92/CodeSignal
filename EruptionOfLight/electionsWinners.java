int electionsWinners(int[] votes, int k) {
    int victors = 0;
    
    for(int i = 0; i < votes.length; i++){
        int check = votes[i] + k;
        for(int j = 0; j < votes.length; j++){
            if( i != j && check <= votes[j])
                break;
            else if(j == votes.length - 1)
                victors++;
        }
    }
    return victors;
}
