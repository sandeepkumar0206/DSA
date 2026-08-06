class Solution {
    public int[] decimalRepresentation(int n) {
        int t=1;
        List<Integer>li=new ArrayList<>();
        while(n!=0){
            int d=n%10;
            if(d!=0)li.add(d*t);
            t*=10;
            n/=10;
        }
        Collections.sort(li,Collections.reverseOrder());
        int k=li.size();
        int ans[]=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=li.get(i);
        }
        return ans;
    }
}


class Solution {
    public int[] decimalRepresentation(int n) {
        int t=1;
        List<Integer>li=new ArrayList<>();
        while(n!=0){
            int d=n%10;
            if(d!=0)li.add(0,d*t);
            t*=10;
            n/=10;
        }
        // Collections.sort(li,Collections.reverseOrder());
        int k=li.size();
        int ans[]=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=li.get(i);
        }
        return ans;
    }
}