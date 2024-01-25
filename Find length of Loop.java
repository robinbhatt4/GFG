class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {   int count=0;
    Node slow=head;
    Node fast=head;
    boolean res=false;
    while(fast!=null && fast.next!=null)
    {
        fast=fast.next.next;
        slow=slow.next;
        if(fast==slow)
        {res=true;
            break;
        }
        
    }
    if(res==false)
    {return 0;}
    slow=head;
    while(fast!=slow)
    {
    fast=fast.next;
    slow=slow.next;
    }
    
    do {
            fast = fast.next;
            count++;
        } while(fast != slow);
    return count;}
}