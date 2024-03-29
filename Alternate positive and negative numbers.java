//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrange(int arr[], int n) {
        // code here
        Stack<Integer> pos=new Stack<>();
        Stack<Integer> neg=new Stack<>();
        int j=0;
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]>=0)
            {
                pos.push(arr[i]);
            }
            else
            {
                neg.push(arr[i]);
            }
        }
        while(!pos.isEmpty() || !neg.isEmpty())
        {
            if(j%2==0 && !pos.isEmpty())
            {
                arr[j]=pos.pop();
            }
            else if(j%2 ==1 && !neg.isEmpty())
            
            {
                arr[j]=neg.pop();
            }
            else if(!neg.isEmpty())
            {
                arr[j]=neg.pop();
            }
            else if(!pos.isEmpty())
            {
                arr[j]=pos.pop();
            }
            j++;
        }
    }
}