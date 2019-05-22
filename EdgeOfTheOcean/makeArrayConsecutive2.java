int makeArrayConsecutive2(int[] statues) {
    int min = statues[0], max = statues[0];
    int counter = 0;
    for(int i = 1; i < statues.length; i++){
        if(min > statues[i])
            min = statues[i];
        if(max < statues[i])
            max = statues[i];
    }
    int[] checkArray = new int[(max-min) + 1];
    for(int i = 0; i < statues.length; i++)
        checkArray[statues[i] - min]++;
    for(int i = 0; i < checkArray.length; i++)
        if(checkArray[i] == 0)
            counter++;
    
    return counter;
    
}
