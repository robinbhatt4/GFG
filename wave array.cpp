class Solution{
    public:
    // arr: input array
    // n: size of array
    //Function to sort the array into a wave-like array.
    void convertToWave(int n, vector<int>& arr){
        vector <int> ans;
        if(n%2==0)
        {for(int i=0;i<n;i+=2)
        swap(arr[i],arr[i+1]);
        }
        else
        {
            for(int j=0;j<n-1;j+=2)
            swap(arr[j],arr[j+1]);
        }
        // Your code here
      for(int i=0;i<ans.size();i++)
      cout<<ans[i];
    }
};