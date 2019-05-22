boolean isIPv4Address(String inputString) {
    int check = 0, counter = -1;
    boolean used = false;
    for(int i = 0; i < inputString.length(); i++){
        char var = inputString.charAt(i);
        
        if(var == '.' && checkLimit(check)){
            if(counter == -1 || (inputString.charAt(i + 1) == '.' && inputString.charAt(i) == '.'))
                return false;
            System.out.println(check);
            check = 0;
            counter++;
        }else{
            if(counter == -1)
                counter = 0;
            check = (check * 10) + Character.getNumericValue(inputString.charAt(i));
        }
        if(!checkLimit(check) || (Character.isLetter(var) && var != '.'))
            return false;
    }
    if(counter == 3)
        return true;
    return false;
}

public boolean checkLimit(int num){
    if(num <= 255 && num >= 0)
        return true;
    return false;
}
