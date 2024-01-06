class Solution{
  public:
    // Should return head of the modified linked list
    Node *sortedInsert(struct Node* head, int data) {
            int x=data;
        Node *newnode=new Node(x);
        
        if(head==NULL)return newnode;
        
        if(x<=head->data)
        {
            newnode->next=head;
            return newnode;
        }
        
        Node* curr=head;
        Node* prev=head;
        
        while(curr!=NULL){
            
            if(curr->data >x && prev->data <=x )
            {
                prev->next=newnode;
                newnode->next=curr;
                return head;
            }
            prev =curr;
            curr=curr->next;
            
        }
        prev->next=newnode;
        return head;
        
    

        // Code here
    }
};