 class Solution{
public:
	// function to return sum of elements
	// in an array of size n
	int sum(int arr[], int n) {
	    int su=0;
	    for(int i=0;i<n;i++)
	    {
	        su+=arr[i];
	    }
	    return su;
	}
};