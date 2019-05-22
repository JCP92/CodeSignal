int depositProfit(int deposit, int rate, int threshold) {
    int year = 0;
    double dep = (double)deposit;
    while(dep < threshold){
        year++;
        dep += (dep * ((double)rate * .01));
        System.out.printf("year %d: %.2f%n", year, dep);
    }
    return year;
}
