import java.util.*;
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {  Node temp=head;
    int zerocnt=0;int onecnt=0;int twocnt=0;
    while(temp!=null)
    {
        if(temp.data==0)
        zerocnt++;
        else if(temp.data==1)
        onecnt++;
        else
        twocnt++;
        
        temp=temp.next;
    }
    Node newnode=head;
    while(newnode!=null)
    {
        if(zerocnt !=0)
        {newnode.data=0;
        zerocnt--;}
        
        else if(onecnt!=0)
        {newnode.data=1;
        onecnt--;}
        
        else
        {newnode.data=2;
        twocnt--;}
        
    }
    return head;
    
        // add your code here
    }
}