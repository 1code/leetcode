public class Solution {
    public int numDistinct(String S, String T) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int m = T.length(), n = S.length();
        int[] f = new int[m + 1];
        f[0] = 1;
        for(int i = 1; i <= n; ++i){
            for(int j = m; j >= 1; --j){
                f[j] += (T.charAt(j - 1) == S.charAt(i - 1))?f[j - 1]:0;
            }
        }
        return f[m];
    }
}

public class Solution {
    public int numDistinct(String S, String T) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int m = T.length(), n = S.length();
        int[][] dp = new int[m + 1][n + 1];
        for(int j = 0; j <= n; ++j)
            dp[0][j] = 1;
            
        for(int i = 1; i <= m; ++i){
            for(int j = 1; j <= n; ++j){
                dp[i][j] = dp[i][j - 1] 
                + ((T.charAt(i - 1) == S.charAt(j - 1))?dp[i - 1][j - 1]:0);
            }
        }
        
        return dp[m][n];
    }
}