class Solution{
  public:
    int missingNumber(vector<int>& array, int n) {
        
        int sum2=0;
        for(int i=0;i<array.size();i++)
        {
            sum2+=array[i];
        }
        return ((n*(n+1)/2)-sum2);
        // Your code goes here
    }
};