class Solution
{
   public:
    int findSum(int A[], int N)
    {int max=A[0];
    int min=A[0];
    for(int i=0;i<N;i++)
    {
        if(max>=A[i])
        max=A[i];
        if(min<=A[i])
        min=A[i];
    }
    return max+min;	//code here.
    }

};