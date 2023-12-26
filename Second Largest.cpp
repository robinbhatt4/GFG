class Solution{
public:	
	// Function returns the second
	// largest elements
	int print2largest(int arr[], int n) {
	   
	   int t=-1;
	   sort(arr,arr+n);
	   for(int i=n-1;i>0;i--)
	   {    if(arr[i]>arr[i-1])
	       {t=arr[i-1];
	       break;}
	       
	   }
	   
	   return t;
	   
	}
};