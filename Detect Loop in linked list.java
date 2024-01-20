class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        // Add code here
        Node first=head;
        Node second=head;
        if(head==null && head.next==null)
        return false;
        while(second.next!=null && second.next.next!=null)
        {   first=first.next;
        second=second.next.next;
            if(first==second)
            return true;
            
        }
        return false;
    }
}