int missingNumber(int A[], int N)
{ int sum=0;
for(long i=0;i<N-1;i++)
{
    sum+=A[i];
}
int x=(N*(N+1)/2);
return x-sum;
    // Your code goes here
}