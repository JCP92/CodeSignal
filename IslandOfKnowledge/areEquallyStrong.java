boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
    int matching = 0;
    if(yourLeft + yourRight == friendsLeft + friendsRight)
        matching++;
    if(yourLeft == friendsLeft || yourLeft == friendsRight ||
       yourRight == friendsLeft || yourRight == friendsRight)
        matching++;
    
    if(matching == 2)
        return true;
    
    return false;
}
