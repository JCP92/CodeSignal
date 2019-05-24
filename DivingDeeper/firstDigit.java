char firstDigit(String inputString) {
    for(int i = 0; i < inputString.length(); i++){
        Character ch = inputString.charAt(i);
        if(Character.isDigit(ch))
            return ch;
    }
    return '_';
}
