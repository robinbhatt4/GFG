class Solution {
public:
    int PalinArray(int a[], int n)
    {   
        for(int i=0;i<n;i++)
    {
    int num=a[i],sum=0;
    
    
        while(num>0)
        {int temp=num%10;
        num/=10;
        sum=(sum*10)+temp;
        
        }
        if(sum!=a[i])
        return 0;
        
    }
    return 1;
    	// code here
    }
};