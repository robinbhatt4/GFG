//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0)
        {
            String s;
            s = br.readLine();
            
            Solution ob = new Solution();
            
            System.out.println(ob.modify(s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
   
    String modify(String S)
    {StringBuilder sb= new StringBuilder();
    //char[] ch=S.toCharArray();
    
        for(int i=0;i<S.length();i++)
        {char ch=S.charAt(i);
            if(ch==' ')
            continue;
            sb.append(ch);

        }
        return sb.toString();
        // your code here
        // String ans=" ";
        // for(int i=0;i<S.length();i++)
        // {char ch=S.charAt(i);
        //     if(ch==' ')
        //     continue;
        //     ans+=ch;

        // }
        // return ans;
    }
}