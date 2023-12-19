Node* sortedMerge(Node* head1, Node* head2)  
{     if (head1 == NULL) return head2;
    if (head2 == NULL) return head1;

    Node* ans = new Node(-1);
    Node* temp = ans;
    while (head1 != NULL && head2 != NULL) {
        if (head1->data < head2->data) {
            temp->next = head1;
            temp = temp->next;
            head1 = head1->next;
        } else {
            temp->next = head2;
            temp = temp->next;
            head2 = head2->next;
        }
    }

    while (head1 != NULL) {
        temp->next = head1;
        temp = temp->next;
        head1 = head1->next;
    }
    while (head2 != NULL) {
        temp->next = head2;
        temp = temp->next;
        head2 = head2->next;
    }
    
    // Set ans to the actual merged list (skip the dummy node)
    ans = ans->next;
    return ans;
    
}  