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
        else if(temp.data==2)
        twocnt++;
        
        temp=temp.next;
    }
    Node temp2=head;
    while(temp2!=null)
    {
        while(zerocnt!=0)
        {
            temp2.data=0;
            temp2=temp2.next;
            zerocnt--;
        }
        while(onecnt!=0)
        {
            temp2.data=1;
            temp2=temp2.next;
            onecnt--;
        }
        while(twocnt!=0)
        {
            temp2.data=2;
            temp2=temp2.next;
            twocnt--;
        }
        
    }
    return head;
    
        // add your code here
    }
}