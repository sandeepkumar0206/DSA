class Solution {
    public boolean lemonadeChange(int[] bills) {
        int c5=0,c10=0,c20=0;
        for(int i:bills){
            if(i==5){
                c5++;
            }
            else if(i==10){
                c10++;
                if(c5!=0){
                    c5--;
                }
                else{
                    return false;
                }
            }
            else{
                c20++;
                int curr=15;
                while(curr!=0 && curr!=5 && c10!=0){
                    curr-=10;
                    c10--;
                }
                while(curr!=0 && c5!=0){
                    curr-=5;
                    c5--;
                }
                if(curr!=0){
                    return false;
                }
            }
        }
        return true;
    }
}