//{ Driver Code Starts
import java.io.*;
import java.util.*;

class gfg {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int w = Integer.parseInt(br.readLine());

            String line = br.readLine();
            String[] tokens = line.split(" ");
            List<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] val = new int[array.size()];
            int idx = 0;
            for (int i : array) val[idx++] = i;

            String lin = br.readLine();
            String[] toke = lin.split(" ");
            List<Integer> array1 = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : toke) {
                array1.add(Integer.parseInt(token));
            }

            int[] wt = new int[array1.size()];
            idx = 0;
            for (int i : array1) wt[idx++] = i;

            // calling method knapSack() of class Solution
            System.out.println(new Solution().knapSack(w, wt, val));
        }
    }
}
// } Driver Code Ends
class Solution {
    
    static int knapSack(int W, int wt[], int val[]) {
        
        for(int it[]: dp)Arrays.fill(it, -1);
        return helper2(W,wt,val,val.length);
        
    }
    static int[][] dp = new int[1001][1001];
    
    static int helper2(int W, int[] wt, int[] val,int ind){
        if(ind==0 || W==0){
            return 0;
        }
        else if(dp[ind][W] != -1){
            return dp[ind][W];
        }
        else if(wt[ind-1] > W){
            return dp[ind][W] = helper2(W,wt,val,ind-1);
        }
        else{
            return dp[ind][W] = Math.max(helper2(W-wt[ind-1],wt,val,ind-1)+val[ind-1], helper2(W,wt,val,ind-1));
        }
    }

    static int helper(int W, int[] wt, int[] val, int ind){
        if(ind >= val.length || W <= 0){
            return 0;
        }
        else if(dp[ind][W] != -1){
            return dp[ind][W];
        }
        else if(wt[ind] > W){
            return dp[ind][W] = helper(W, wt, val, ind+1);
        }
        else{
            return dp[ind][W] = Math.max(helper(W-wt[ind], wt, val, ind+1)+val[ind],helper(W,wt,val,ind+1));
        }
    }
}
