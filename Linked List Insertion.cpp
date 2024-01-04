    class Solution{
  public:
    //Function to insert a node at the beginning of the linked list.
    Node *insertAtBegining(Node *head, int x) {
      
       Node *newdata= new Node(x);
        newdata->next=head;
        head=newdata;
       
        return head;
        
       // Your code here
    }
    
    
    //Function to insert a node at the end of the linked list.
    Node *insertAtEnd(Node *head, int x)  {
        Node *newdata= new Node(x);
        Node *temp=head;
        if(head==NULL)
        {
            return newdata;
        }
        
            while(temp->next!=NULL)
            {   
                temp=temp->next;
            }
            
            temp->next=newdata;
            
            return head;
        
       // Your code here
    }
};