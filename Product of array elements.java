//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

class Product
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Long arr[] = new Long[n];
            
            for(int i = 0; i < n; i++)
              arr[i] = sc.nextLong();
              
              Long mod = 1000000007L;
              GfG gfg = new GfG();
              System.out.println(gfg.product(arr, mod, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

/*  
     arr[] is the array
     n = number of element in array
     mod = modulo value;
*/
class GfG
{
    public static Long product(Long arr[], Long mod, int n)
    {
        long prod=1;
        for(int i=0;i<n;i++)
        {
            prod=(prod*arr[i])%mod;
        }
        return prod;
        //yout code here
    }
}
`