String reverseInParentheses(String inputString) {
    String phrase = "";
    int openPar = 0;
    int closedPar = 0;
    
    for(int i = 0; i < inputString.length(); i++){
        char check = inputString.charAt(i);
        if(check == '(')
            openPar = i;
        if(check == ')'){
            closedPar = i;
            phrase = inputString.substring(openPar + 1, closedPar);
            return reverseInParentheses(inputString.substring(0, openPar) + 
                                        reverse(phrase) + inputString.substring(closedPar + 1));
        }
    }
    return inputString;
}

public String reverse(String word){
    String reverseWord = "";
    for(int i = word.length() - 1; 0 <= i; i--){
        reverseWord = reverseWord + String.valueOf(word.charAt(i));
    }
    return reverseWord;
}

