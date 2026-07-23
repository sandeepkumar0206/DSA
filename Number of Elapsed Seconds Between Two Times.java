class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int sh=Integer.valueOf(startTime.substring(0,2));
        int eh=Integer.valueOf(endTime.substring(0,2));
        int sm=Integer.valueOf(startTime.substring(3,5));
        int em=Integer.valueOf(endTime.substring(3,5));        
        int ss=Integer.valueOf(startTime.substring(6));
        int es=Integer.valueOf(endTime.substring(6));
        int s=(eh-sh)*(3600)+(em-sm)*60+(es-ss);
        return s;

    }
}