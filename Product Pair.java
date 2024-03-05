//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            long x = Long.parseLong(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            boolean ans = new Solution().isProduct(arr, n, x);
            System.out.println(ans ? "Yes" : "No");
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    boolean isProduct(int[] arr, int n, long x) {
        // code here
        Map<Long ,Integer> map=new HashMap<>();
        
        for(int i=0;i<n;i++){
            map.put((long)arr[i] , map.getOrDefault((long)arr[i] , 0)+1);
        }
        
        for(int i=0;i<n;i++){
            if(arr[i]!=0&&x%arr[i]==0){
                int freq=map.get((long)arr[i]);
                freq--;
                long second=x/arr[i];
                if(map.containsKey(second)){
                    if(second==arr[i]&&freq!=0){
                        return true;
                    }
                    else{
                        if(second!=arr[i]) return true;
                    }
                }
            }
        }
        
        return false;
    }
}