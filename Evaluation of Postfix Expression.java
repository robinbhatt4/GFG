//{ Driver Code Starts
    import java.util.*;
    import java.lang.*;
    import java.io.*;
    
    class GFG {
        
        public static void main (String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            while(t-->0){
                System.out.println(new Solution().evaluatePostFix(br.readLine().trim()));
            }
        }
    }
    // } Driver Code Ends
    
    
    class Solution
    {
        //Function to evaluate a postfix expression.
        public static int evaluatePostFix(String S)
        {Stack<Integer> st=new Stack<>();
        int ans=0;
        for(int i=0;i<S.length();i++)
        {
            char ch=S.charAt(i);
            if(ch!='*' && ch!='-' && ch!='+' && ch!='/')
            {
                int op=Character.getNumericValue(ch);
                st.push(op);
            }
            else {
                if(ch=='+')
                {
                    int n1=st.pop();
                    int n2=st.pop();
                    ans=n1+n2;
                    st.push(ans);
                }
                else if(ch=='-'){
                        int n1 = st.pop();
                        int n2 = st.pop();
                        ans=n2-n1;
                        st.push(ans);
                    
                    }else if(ch=='*'){
                        int n1 = st.pop();
                        int n2 = st.pop();
                        ans=n1*n2;
                        st.push(ans);
                    }else{
                        int n1 = st.pop();
                        int n2 = st.pop();
                        ans=n2/n1;
                         st.push(ans);
                    }
            }
            
        }
        return ans;// Your code here
        }
    }