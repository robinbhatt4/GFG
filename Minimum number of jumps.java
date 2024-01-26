//{ Driver Code Starts
    import java.lang.*;
    import java.io.*;
    import java.util.*;
    class GFG
     {
        public static void main (String[] args) throws IOException
         {
         
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
            int t = Integer.parseInt(br.readLine()); 
    
            while(t-- > 0){
                int size = Integer.parseInt(br.readLine());
                String[] arrStr = ((String)br.readLine()).split("\\s+");
                int[] arr= new int[size];
                for(int i = 0;i<size;i++){
                    arr[i] = Integer.parseInt(arrStr[i]);
                }
                System.out.println(new Solution().minJumps(arr));
            }
         }
         
    }
    
    // } Driver Code Ends
    
    
    class Solution{
        static int minJumps(int[] arr){
            if(arr.length==1){
                return 0;
            }
            int a=arr[0];
            if(a==0){
                return -1;
            }
            
            int jump=0;
            int curr_pos=0;
            int prev_pos=0;
            
            while(true){     //INFINITE LOOP
                int j=0;
                int index=0;
                while(a>0){
                    index++;
                    if(index+prev_pos>=arr.length-1){
                        jump++;
                        return jump;
                    }
                    int temp=arr[prev_pos+index];
                    if(j<=temp+index){
                        curr_pos=prev_pos+index;
                        j=temp+index;
                    }
                    a--;
                }
                if(j==0){
                    return -1;
                }
                else{
                    prev_pos=curr_pos;
                    a=arr[curr_pos];
                    jump++;
                }
            }
            
        }
    }