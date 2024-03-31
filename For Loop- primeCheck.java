//{ Driver Code Starts
    import java.io.*;
    import java.util.*;
    
    class GFG {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t;
            t = Integer.parseInt(br.readLine());
            while(t-- > 0){
                
                int n;
                n = Integer.parseInt(br.readLine());
                
                Solution obj = new Solution();
                String res = obj.isPrime(n);
                
                System.out.println(res);
                
            }
        }
    }
    
    // } Driver Code Ends
    
    
    
    class Solution {
        public static String isPrime(int n) {
            if(n==1)
            return "No";
                    
            // Code here
            boolean bool=true;
            for (int i = 2; i <= Math.sqrt(n) ; i++) {
                if((n%i)==0)
                bool=false;
                
            }
            if(bool==true)
            return "Yes";
            else
            return "No";
        }
    }
            
    