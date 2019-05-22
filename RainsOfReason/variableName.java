boolean variableName(String name) {
    for(int i = 0; i < name.length(); i++){
        char var = name.charAt(i);
        if( i == 0 && Character.isDigit(var) )
            return false;
        else if(!Character.isLetterOrDigit(var)){
            if(var != '_')
                return false;
        }
    }
    return true;
}
