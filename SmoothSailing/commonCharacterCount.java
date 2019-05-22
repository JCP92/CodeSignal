int commonCharacterCount(String s1, String s2) {
    int charCount = 0;
    int[] indexTracker = new int[15];
    for(int i = 0; i < s1.length(); i ++){
        Character one = new Character(s1.charAt(i));
        for(int j = 0; j < s2.length(); j++){
            Character two = new Character(s2.charAt(j));
            if(one.equals(two) && indexTracker[j] == 0){
                charCount++;
                indexTracker[j]++;
                break;
            }
        }
    }
    return charCount;
}
