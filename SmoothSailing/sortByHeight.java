int[] sortByHeight(int[] a) {

    for(int i = 0; i < a.length; i++){
        if(a[i] == -1){}
        else{
            for(int j = i + 1; j < a.length; j++){
                if(a[j] == -1) {}
                else if(a[i] > a[j])
                    doSwap(a, i, j);
            }
        }
    }
    return a;
}
public void doSwap(int[] a, int b, int c){
    int temp = a[b];
    a[b] = a[c];
    a[c] = temp;
}
