//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
            
            Solution ob = new Solution();
            char res = ob.firstRep(s);
            if (res == '#')
                System.out.println(-1);
            else
                System.out.println(res);
             
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    char firstRep(String S)
    {
        HashMap<Character,Integer> map=new HashMap<>();
        int index=Integer.MAX_VALUE;
       
        for(int i=0;i<S.length();i++)
       {char ch=S.charAt(i);
        if(map.containsKey(ch))
        {
            if(index>map.get(ch))
            index=map.get(ch);
        }
        else
        {
            map.put(ch,i);
        }
       }
       
        return index==Integer.MAX_VALUE?'#':S.charAt(index) ;
        // your code here
    }
}