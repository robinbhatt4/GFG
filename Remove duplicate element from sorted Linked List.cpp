Node *removeDuplicates(Node *head)
{Node *temp=head;

while(head->next!=NULL)
{   if(head->data==head->next->data)
    {
       head->next=head->next->next; 
    }
    else
    head=head->next;
}
return temp;
 // your code goes here
}