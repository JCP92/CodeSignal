String alphabeticShift(String inputString) {
    String newWord = "";
    for(int i = 0; i < inputString.length(); i++){
        char var = inputString.charAt(i);
        System.out.printf("%d: %s%n", i, var);
        if(var == 'z')
            newWord += "a";
        else if(Character.isLetter(var))
            newWord += Character.toString((var + 1));
    }
    return newWord;
}
