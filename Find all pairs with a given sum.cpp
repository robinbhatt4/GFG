class Solution{
    public:
    vector<pair<int,int>> allPairs(int A[], int B[], int N, int M, int X)
    { vector <pair<int,int>> ans;
        sort(A,A+N);
        sort(B,B+M);
        for(int i=0;i<N;i++)
    {
        for(int j=0;j<M;j++)
        {
            if(A[i]+B[j]==X)//&&(A[i]B<[j]))
            {
                ans.push_back(make_pair(A[i],B[j]));
            }
        }
    }
    return ans;    // Your code goes here   
    }
};