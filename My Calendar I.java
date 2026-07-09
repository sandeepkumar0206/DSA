class MyCalendar {
    List<int[]>list=new ArrayList<>();
    public MyCalendar() {
        this.list=new ArrayList<>();
    }
    
    public boolean book(int startTime, int endTime) {
        if(list.size()==0){
            list.add(new int[]{startTime,endTime});
            return true;
        }
        int i=0,j=list.size();
        while(i<j){
            int mid=i+(j-i)/2;
            if(list.get(mid)[0]<startTime){
                i=mid+1;
            } 
            else{
                j=mid;
            }
        }
        if (i<list.size() && startTime<list.get(i)[1] && endTime>list.get(i)[0]){
            return false;
        }
        if (i>0 && startTime < list.get(i-1)[1] && endTime>list.get(i-1)[0]){
            return false;
        }
        list.add(i,new int[]{startTime,endTime});
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */