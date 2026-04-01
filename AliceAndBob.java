class Solution {
    public static int find(String s){
        int arr[]={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int m=Integer.valueOf(s.substring(0,2));
        int d=Integer.valueOf(s.substring(3,5));
        for(int i=0;i<m-1;i++){
            d+=arr[i];
        }
        return d;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int a1=find(arriveAlice);
        int a2=find(leaveAlice);
        int b1=find(arriveBob);
        int b2=find(leaveBob);
        int s=Math.max(a1,b1);
        int e=Math.min(a2,b2);
        if(s<=e){
            return e-s+1;
        }
        return 0;
    }
}