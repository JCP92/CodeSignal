String[] addBorder(String[] picture) {
    int stringLength = picture[0].length() + 2;
    int arraySize = picture.length + 2;
    
    String[] framed = new String[arraySize];
    Arrays.fill(framed, "");
    
    for(int i = 0; i < arraySize; i++){ //nav through the picture array
        if(i == 0 || i == arraySize - 1){ // if on the first/last element fill with astricks
            for(int m = 0; m < stringLength; m++)
                framed[i] = framed[i] + String.valueOf("*");
        }else{
            for(int n = 0; n < stringLength; n++){
                if(n == 0 || n == stringLength - 1)
                    framed[i] = framed[i] + String.valueOf("*");
                else
                    framed[i] = framed[i] + String.valueOf(picture[i - 1].charAt(n - 1));
            }
        }
    }
    return framed;
}
