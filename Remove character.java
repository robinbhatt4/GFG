//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String string1 = read.readLine();
            String string2 = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.removeChars(string1,string2) );
        }
    }
}


// } Driver Code Ends


//User function Template for Java
class Solution{
    static String removeChars(String string1, String string2){
        // code here
        String str="";
        ArrayList<Character> arr=new ArrayList<>();
        for(char ch: string2.toCharArray())
        {
            if(!arr.contains(ch))
            arr.add(ch);
        }
        for(int i=0;i<string1.length();i++)
        {
            if(!arr.contains(string1.charAt(i)))
            {
                str+=string1.charAt(i);
            }
        }
        return str;
        
       
        
    }
}