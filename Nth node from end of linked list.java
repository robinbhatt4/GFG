class Solution
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {Node temp=head;
    int len=0,req=0,cnt=0;
    while(temp!=null)
    {len++;
        temp=temp.next;
    }
    req=len-n+1;
    temp=head;
    //if(req<n) return -1;
      while(temp!=null)
    {cnt++;
        if(cnt==req)
    return temp.data;
        temp=temp.next;
    }
    return -1;	// Your code here	
    }
}