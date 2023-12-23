void MyStack ::push(int x) 
{StackNode *temp =new StackNode(x);
    temp->next=top;
    top=temp;
     
}

//Function to remove an item from top of the stack.
int MyStack ::pop() 
{StackNode *temp;
   if(top==NULL)
   {
       return -1;
   }
   int ans =top->data;
    temp=top;
    top=top->next;
    
    delete temp;
    return ans;
    // Your Code
}