int matrixElementsSum(int[][] matrix) {
    int row = matrix.length;
    int col = matrix[0].length;
    
    int space = 0;
    
    for(int nr = 0; nr < row; nr++){
        for(int mc = 0; mc < col; mc++){
            if(matrix[nr][mc] == 0 && nr != row - 1)
                matrix[nr + 1][mc] = 0;
            if(matrix[nr][mc] != 0)
                space += matrix[nr][mc];  
        }
    }
    return space;
}
