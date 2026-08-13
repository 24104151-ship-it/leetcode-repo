// Last updated: 13/08/2026, 15:17:21
class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int start=toSeconds(startTime);
        int end =toSeconds(endTime);
        return end-start;
        
        
    }
    private int toSeconds(String time){
        String[] part=time.split(":");
        int h=Integer.parseInt(part[0]);
        int m=Integer.parseInt(part[1]);
        int s=Integer.parseInt(part[2]);
        return h*3600+m*60+s;
    }
}