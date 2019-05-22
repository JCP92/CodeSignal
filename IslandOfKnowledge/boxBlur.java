int[][] boxBlur(int[][] image) {
    int row = image.length;
    int col = image[0].length;
    int blurRow = row - 2; 
    int blurCol = col - 2;
    
    int[][] blur = new int[blurRow][blurCol];
    
    for(int i = 0; i < blurRow; i++){
        for(int j = 0; j < blurCol; j++){
            blur[i][j] = getBlur(image, i, j);
        }
    }
    return blur;
}
public int getBlur(int[][] image, int rowLoc, int colLoc){
    int total = 0;
    for(int i = rowLoc; i < (rowLoc + 3); i++){
        for(int j = colLoc; j < (colLoc + 3); j++){
            total += image[i][j];
        }
    }
        
    return total / 9;
}
