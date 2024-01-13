class Solution {
    
    //Return the sum of last k nodes
    public int sum(Node head, int k){
        int length=0;
        Node temp=head;
        int sum=0;
        int req=0;
        while(temp!=null)
        {
            length++;
            temp=temp.next;
        }
        req=length-k;
        temp=head;
        int i=1;
        while(i<=req)
        {
            temp=temp.next;
            i++;
        }
        while(temp!=null)
        {
            sum+=temp.data;
            temp=temp.next;
        }
        return sum;
      //write code here
    }
}