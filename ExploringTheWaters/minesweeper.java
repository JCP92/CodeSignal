int[][] minesweeper(boolean[][] matrix) {
    int rowSize = matrix.length;
    int colSize = matrix[0].length;
    
    int[][] board = new int[rowSize][colSize];
    
    for(int i = 0; i < rowSize; i++){
        for(int j = 0; j < colSize; j++){
            board[i][j] = checkNeighbor(matrix, i, j, rowSize, colSize);
        }
    }
    return board;
}
public int checkNeighbor(boolean[][] ar, int i, int j, int rowSize, int rowCol){
    int count = 0;
    
    count += check(ar, i - 1, j, rowSize, rowCol) ? 1 : 0;//north
    count += check(ar, i - 1, j + 1, rowSize, rowCol) ? 1 : 0;//north east
    count += check(ar, i - 1, j - 1, rowSize, rowCol) ? 1 : 0;//north west
    count += check(ar, i + 1, j, rowSize, rowCol) ? 1 : 0; //south
    count += check(ar, i + 1, j + 1, rowSize, rowCol) ? 1 : 0; //south east
    count += check(ar, i + 1, j - 1, rowSize, rowCol) ? 1 : 0; //south west
    count += check(ar, i, j - 1, rowSize, rowCol) ? 1 : 0; //left
    count += check(ar, i, j + 1, rowSize, rowCol) ? 1 : 0; //right
    
    return count;
}
public boolean check(boolean[][] ar, int i, int j, int rowSize, int rowCol){
    if(inbounds(i, j, rowSize, rowCol)){
        if(ar[i][j] == true)
            return true;
    }
    return false;
}
public boolean inbounds(int i, int j, int rowSize, int rowCol){
    if(i >= 0 && i < rowSize && j >= 0 && j < rowCol){
        return true;
    }
    return false;
}
