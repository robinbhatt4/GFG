class Solution{
  public:
    vector<int> duplicates(long long arr[], int n) {
        vector <int> v;
        
        set<int> ans;
        sort(arr,arr+n);
        for(int i=0;i<n-1;i++)
            {
            if(arr[i]==arr[i+1])
            {ans.insert(arr[i]);}
             }
        if(ans.empty())
        {
            v.push_back(-1);
            return v;
            
        }
        else
        {
            for (auto i : ans)
            {cout << i << ' ';}
        }
       
    }
};  