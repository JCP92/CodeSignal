boolean chessBoardCellColor(String cell1, String cell2) {
    int letter1 = cell1.charAt(0) - 'A';
    int number1 = Character.getNumericValue(cell1.charAt(1)) - 1;
    
    int letter2 = cell2.charAt(0) - 'A';
    int number2 = Character.getNumericValue(cell2.charAt(1)) - 1;
    
    boolean[][] board = new boolean[8][8];
    for(int i = 0; i < 8; i++){
        for(int j = 0; j < 8; j++){
            if((i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 ==1))
                board[i][j] = true;
            else
                board[i][j] = false;
        }
    }
    
    return (board[letter1][number1] == board[letter2][number2]);
}
