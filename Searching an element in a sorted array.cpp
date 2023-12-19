class Solution{
    public:
    // Function to find element in sorted array
    // arr: input array
    // N: size of array
    // K: element to be searche
    int searchInSorted(int arr[], int N, int K) 
    { int end=N-1;
    int beg=0;
    while(beg<=end)
    {
        int mid=(beg+end)/2;
        if(arr[mid]==K)
        return 1;
        else if(arr[mid]>K)
        end=mid-1;
        else if(arr[mid]<K)
        beg=mid+1;
    }
    return -1;
    
       // Your code here
       
    }
};