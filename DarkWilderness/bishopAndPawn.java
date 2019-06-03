boolean bishopAndPawn(String bishop, String pawn) {
    int bishopLetter = (int)bishop.charAt(0) - (int)'a';
    int bishopNum = Character.getNumericValue(bishop.charAt(1) - 1);
    int pawnLetter = (int)pawn.charAt(0) - (int)'a';
    int pawnNum = Character.getNumericValue(pawn.charAt(1)) - 1;
    
    if(borderCheck(bishopLetter, bishopNum, pawnLetter, pawnNum, 1, 1))
        return true;
    if(borderCheck(bishopLetter, bishopNum, pawnLetter, pawnNum, 1, -1))
        return true;
    if(borderCheck(bishopLetter, bishopNum, pawnLetter, pawnNum, -1, 1))
        return true;
    if(borderCheck(bishopLetter, bishopNum, pawnLetter, pawnNum, -1, -1))
        return true;
    
    return false;
}
boolean borderCheck(int bishopLetter, int bishopNum, int pawnLetter, int pawnNum, int letter, int num){
    while(checkPosition(bishopLetter, bishopNum)){
        if(bishopLetter == pawnLetter && bishopNum == pawnNum)
            return true;
        bishopLetter += letter;
        bishopNum += num;
    }
    if(bishopLetter == pawnNum && bishopNum == pawnNum)
            return true;
    return false;
}
boolean checkPosition(int bishopLetter, int bishopNum){
    if((bishopLetter < 8 && bishopLetter >= 0) && (bishopNum < 8 && bishopNum >= 0))
        return true;
    return false;
}
