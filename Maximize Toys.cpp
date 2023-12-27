class Solution{
public:
    int toyCount(int N, int K, vector<int> arr)
    {sort(arr.begin(),arr.end());
    int count=0;
    for(int i=0;i<N;i++)
    {if(arr[i]<=K)
    {
        K-=arr[i];
        if(K>=0)
        count++;
    }

        // code here
    }
    return count;
}}