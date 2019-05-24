String longestDigitsPrefix(String inputString) {
    String numbers = "";
    for(int i = 0; i < inputString.length(); i++){
        char ch = inputString.charAt(i);
        if(Character.isDigit(ch))
            numbers += Character.toString(ch);
        else
            break;
    }
    return numbers;
}
