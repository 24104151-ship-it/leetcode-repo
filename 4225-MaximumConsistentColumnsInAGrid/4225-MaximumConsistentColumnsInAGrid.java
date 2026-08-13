// Last updated: 13/08/2026, 15:17:36
class Solution {
    public int maxConsistentColumns(int[][] grid, int limit) {
        int m=grid.length;
        int n=grid[0].length;
        int[] dp=new int[n];
        int ans=1;
        for(int j=0;j<n;j++){
            dp[j]=1;
            for(int k=0;k<j;k++){
                boolean ok=true;
                for(int i=0;i<m;i++){
                    if(Math.abs(grid[i][j]-grid[i][k])>limit){
                        ok=false;
                        break;
                    }
                }
                if(ok){
                    dp[j]=Math.max(dp[j],dp[k]+1);
                }
            }
            ans=Math.max(ans,dp[j]);
            
        }
        return ans;
        
    }
}