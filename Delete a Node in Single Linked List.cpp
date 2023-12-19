Node* deleteNode(Node *head,int x)
{   Node *temp=head;
    Node *curr;
    if(x==1)
    {temp=head;
        head=head->next;
        free(temp);
    }
    else{
    for(int i=0;i<x-1;i++)
    {   curr=temp;
        temp=temp->next;
        
    }
    
    curr->next=temp->next;
    free (temp);
    //delete(temp);
    
    }
    return head;
    //Your code here
}