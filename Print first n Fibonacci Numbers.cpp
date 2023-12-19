class Solution
{
    public:
    //Function to return list containing first n fibonacci numbers.
    vector<long long> printFibb(int n) 
    {long long a=1;
    long long b=1;
    long long temp;
    vector <long long> ans;
    if(n==1)
    {ans.push_back(1);
    return ans;}
    ans.push_back(a);
    ans.push_back(b);
    for(int i=2;i<n;i++)
    {   
        temp=a+b;
        ans.push_back(temp);
        a=b;
        b=temp;

    }
     return ans;   //code here
    }
};