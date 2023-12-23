class Solution
{
    public:
    //Function to find the next greater element for each element of the array.
    vector<long long> nextLargerElement(vector<long long> arr, int n){
        vector <int> ans;
        
        for(int i=0;i<n;i++)
        {int count=0;
            for(int j=i;j<n;j++)
            {
                if(arr[i]<arr[j])
                {count++;
                if(count==1)
                ans.push_back(arr[j]);}
                else
                ans.push_back(-1);
                
            }
        }
        for(int i=0;i<ans.size();i++)
        cout<<ans[i]<<" ";
        // Your code here
    }
};
