class Solution {
    
    //Function to check whether two linked lists are identical or not.
    public boolean isIdentical (Node head1, Node head2){
        //write your code here 
        Node temp=head1;
        Node temp2=head2;
        int length=0,length2=0;
        while(temp!=null)
        {
            length++;
            
            temp=temp.next;
           
        }
        while(temp2!=null)
        {
            length2++;
            
            temp2=temp2.next;
           
        }
        if(length!=length2)
        {return false;}
        
        temp=head1;
        temp2=head2;
        
        while(temp!=null && temp2!=null)
        {
            if(temp.data!=temp2.data)
           { return false;}
            
            temp=temp.next;
            temp2=temp2.next;
        }
        return true;
    }
}