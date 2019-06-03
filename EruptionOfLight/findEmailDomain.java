String findEmailDomain(String address) {
    String sub = address.substring(address.indexOf('@') + 1, address.length());

    while(sub.indexOf('@') != -1){
        sub = sub.substring(sub.indexOf('@') + 1, sub.length());
    }

    return sub;
}

