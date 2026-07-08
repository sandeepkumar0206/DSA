class RecentCounter {
    int arr[]=new int[10000];
    int s,e;

    public RecentCounter() {
        this.s=0;
        this.e=0;
    }
    
    public int ping(int t) {
        while(s<e && t-arr[s]>3000){
            s++;
        }
        arr[e++]=t;
        return e-s;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */