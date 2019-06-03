String buildPalindrome(String st) {
    if(isPalindrome(st))
       return st;
    
    String shortest = st + st;
    
    for(int i = st.length() - 2; i >= 0; i--){
        String temp = st;
        for(int j = i; j >= 0 && !isPalindrome(temp); j--){
            temp += st.charAt(j);
            System.out.println(temp);
            if(isPalindrome(temp) && temp.length() < shortest.length()){
                shortest = temp;
                break;
            }
        }
    }
    return shortest;
}

boolean isPalindrome(String st){
    for(int i = 0, j = st.length() - 1; i < j; i++, j--){
        if(st.charAt(i) != st.charAt(j))
            return false;
    }
    return true;
}

