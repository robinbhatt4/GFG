//{ Driver Code Starts
    import java.util.*;
    class Replace{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Solution g=new Solution();
            System.out.println(g.convertFive(n));
        }
    }
    }
    // } Driver Code Ends
    
    
    /*Complete the function below*/
    class Solution{
        public static int reverse(int n){
            int sum = 0;
            
            while(n > 0){
                int rem = n % 10;
                sum = (sum * 10) + rem;
                n = n / 10;
            }
            
            return sum;
        }
        
        public static int convertFive(int n){
        //add code here.
        
        String ans = "";
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            
            if(rem == 0){
                ans = ans + '5';
            } else {
                ans = ans + rem;
            }
            
            n = n / 10;
        }
        int res = reverse(Integer.parseInt(ans));
        return res;
        }
    }