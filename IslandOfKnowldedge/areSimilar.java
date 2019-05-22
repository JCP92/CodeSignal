boolean areSimilar(int[] a, int[] b) {
    int count = 0, trackA = 1, trackB = 1;
    for(int i = 0; i < a.length; i++){
        if(a[i] != b[i]){
            count++;
            if(count > 2)
                return false;
        }
        trackA *= a[i];
        trackB *= b[i];
    }
    return trackA == trackB;
}
