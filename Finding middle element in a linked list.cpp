class Solution{
    public:
    /* Should return data of middle node. If linked list is empty, then  -1*/
   
    int getMiddle(Node *head)
    {   int count=0;
        vector <int> ans;
        Node *temp=head;
    while(head!=NULL)
    {
        count++;
        head=head->next;
    }
    
    for(int i=0;i<(count/2);i++)
       { temp=temp->next;}
     return temp->data;
      
     

    }
};