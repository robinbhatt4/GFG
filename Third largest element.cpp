class Solution{
  public:
    int thirdLargest(int a[], int n)
    {if(n==1 or n==2 or n==0)
    return -1;
    sort(a,a+n);
    for(int i=n;i>0;i--)
    {
        if(a[i-3]!=a[i-2])
        return a[i-3];
        
    }
         //Your code here
    }

};