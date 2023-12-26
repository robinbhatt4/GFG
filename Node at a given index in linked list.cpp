int GetNth(struct node* head, int index){
    node *temp=head;
    for(int i=0;i<index-1;i++)
    {
        temp=temp->next;
    }
    
    return temp->data;
  // Code here
}
