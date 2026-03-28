class DataStream {
    int val,k,cnt;
    public DataStream(int value, int k) {
        val=value;
        cnt=0;
        this.k=k;
    }
    
    public boolean consec(int num) {
        if(num==val){
            cnt++;
        }
        else{
            cnt=0;
            return false;
        }
        if(cnt==k){
            cnt--;
            return true;
        }
        return false;
    }
}
