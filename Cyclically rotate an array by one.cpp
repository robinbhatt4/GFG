void rotate(int arr[], int n)
{for(int i = 1;i<n;i++){
        int temp=arr[0];
        arr[0]=arr[i];
        arr[i]=temp;
        
    }
}