//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isDigitSumPalindrome(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isDigitSumPalindrome(int n) {
        // code here
        int rev=0;
        int sum=0;
        while(n!=0)
        {int temp=n%10;
         sum+=temp;
         n/=10;
            
        }
        int k=sum;
        while(sum!=0)
        {int temp=sum%10;
        rev=rev*10+temp;
        sum/=10;
        }
        
        if(rev==k)
        return 1;
        else
        return 0;
        
    }
}