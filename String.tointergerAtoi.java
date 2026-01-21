class Solution {
    public int myAtoi(String s) {
        StringBuilder sb=new StringBuilder();
        int i=0,n=s.length();
        while(i<n && s.charAt(i)==' '){
                i++;
        }
        if(i==n){
            return 0;
        }
        boolean neg=false;
        if(s.charAt(i)=='+'){
            i++;
        }
        else if(s.charAt(i)=='-'){
            neg=true;
            i++;
        }
        long ans=0;
        System.out.println(neg);
        while(i<n && Character.isDigit(s.charAt(i))){
                int d=s.charAt(i)-'0';
                ans=ans*10+d;
                System.out.println(ans);
                if(neg==true && ans*(-1)<=Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
                }
                if(neg!=true && ans>=Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;  
                }
            
            i++;
        }
        if(neg==true){
            return -1*(int)ans;
        }
        return  (int)ans;
    }
}