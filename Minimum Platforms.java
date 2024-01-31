//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            
            int arr[] = new int[n];
            int dep[] = new int[n];
            
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
              arr[i] = Integer.parseInt(str[i]);
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                dep[i] = Integer.parseInt(str[i]);
                
            System.out.println(new Solution().findPlatform(arr, dep, n));
        }
    }
    
    
}



// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int helper(int i, int j, int arr[], int dep[], int n, int[][] dp) {
        if(i==n || j==n) {
            return 0;
        }
        if(dp[i][j]!=-1) {
            return dp[i][j];
        }
        int platforms = 1;
        if(arr[i] <= dep[j]) {
            platforms = Math.max(platforms, 1 + helper(i+1, j, arr, dep, n, dp));
        }
        else {
            platforms = -1 + helper(i, j+1, arr, dep, n, dp);
        }
        return dp[i][j] = platforms;
    }
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        int[][] dp = new int[n][n];
        for(int[] row: dp) {
            Arrays.fill(row, -1);
        }
        Arrays.sort(arr);
        Arrays.sort(dep);
        return helper(0, 0, arr, dep, n, dp);       
    }   
}