class Solution {
    int fun(int i,int j,String s1, String s2,int [][] dp){
        if(i==s1.length()){
            return s2.length()-j;
        }
        if(j==s2.length()){
            return s1.length()-i;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j)){
            return fun(i+1,j+1,s1,s2,dp);
        }else{
            int delete= 1+fun(i+1,j,s1,s2,dp);
            int replace = 1+fun(i+1,j+1,s1,s2,dp);
            int insert =1+fun(i,j+1,s1,s2,dp);

            return dp[i][j] = Math.min(delete,Math.min(replace,insert));
        }
    }
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        
        int [][] dp = new int[m+1][n+1];

        for(int [] res:dp){
            Arrays.fill(res,-1);
        }
        return fun(0,0,word1,word2,dp);
    }
}