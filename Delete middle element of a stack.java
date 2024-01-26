class Solution
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        // code here
        Stack<Integer> ans=new Stack<>();
        
        for(int i=0;i<sizeOfStack/2+1;i++)
        {
            ans.add(s.pop());
        }
        ans.pop();
        while(!ans.isEmpty())
        {
            s.add(ans.pop());
        }
    } 
}