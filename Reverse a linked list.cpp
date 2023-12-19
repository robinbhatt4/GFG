class Solution
{
    public:
    //Function to reverse a linked list.
    struct Node* reverseList(struct Node *head)
    {   //Node *current=head;
        Node *temp=NULL;
        Node *temp2=NULL;
        while(head!=NULL)
        {temp2=head->next;
        head->next=temp;
        temp=head;
        head=temp2;
        
        }
        head=temp;
        return head;
        
        // code here
        // return head of reversed list
    }
    
};