//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int k = Integer.parseInt(inputLine[0]);
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().getMinDiff(arr, n, k);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        
        int ans = arr[n-1] - arr[0];
        
        int tempmin = arr[0];
        int tempmax = arr[n-1];
        
        for(int i=1;i<n;i++) {
            if(arr[i] - k < 0) {
                continue; //as ans will be aar[n-1]-arr[0] because the min value will 
            }             //be negative and the difference will be the maximum
            tempmin = Math.min(arr[0] + k, arr[i] - k); 
            //as arr[0] is the smallest so arr[0]+k will be the minumum positive possible
            //value when k is added else possibilty of arr[i]-k is checked for positives
            tempmax = Math.max(arr[i-1] + k , arr[n-1] - k);//same reversed logic here 
            ans = Math.min(ans, tempmax - tempmin);
        }
        return ans;
    

    }
}