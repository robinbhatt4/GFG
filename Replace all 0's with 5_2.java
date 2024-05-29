//{ Driver Code Starts
    import java.util.Scanner;
    import java.lang.Math;
    
    class Convert_To_Five {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            while (T > 0) {
                int N = sc.nextInt();
                System.out.println(new GfG().convertfive(N));
                T--;
            }
        }
    }
    // } Driver Code Ends
    
    
    class GfG {
        int convertfive(int num) {
            // Your code here
            int n=num;
            int rem=0;
            int value=0;
            while(n!=0){
                rem=n%10;
                if(rem==0){
                    rem=5;
                }
               value=value*10+rem;
               n=n/10;
            }
            int number=value;
            int Rem=0;
            int Num=0;
             while(number!=0){
                Rem=number%10;
               Num=Num*10+Rem;
               number=number/10;
            }
            return Num;
        }
    }