//{ Driver Code Starts
    import java.io.*;
    import java.util.*;
    
    class Main {
        
        public static void main (String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
            while(t-->0){
                int n = Integer.parseInt(br.readLine().trim()); // size of array
                int arr[] = new int[n];
                String inputLine[] = br.readLine().trim().split(" ");
                for(int i=0; i<n; i++){
                    arr[i] = Integer.parseInt(inputLine[i]); // input elements of array
                }
                
                Solution ob = new Solution();
                
                System.out.println(ob.maxIndexDiff(arr, n)); // print the result
            }
        }
    }
    // } Driver Code Ends
    
    
    class Solution{
        
        static int maxIndexDiff(int a[], int n) { 
            
            // Your code here
            int c=0;
            for(int i=0;i<n;i++)
            {
                for(int j=1;j<n;j++)
                {
                    if(a[i]<=a[j]&&c<(j-i))
                    {
                        c=j-i;
                    }
                }
                if(c==n-1-i) return c;
            }
            return c;
            
        }
    }
    
    