class Solution {
    
    public long firstIndex(long arr[], long n)
    {
        
        long low=0;long high=n-1;
        
        while(low<=high){
        long mid=(high+low)/2;
        if(arr[(int)mid]==0)
        {
            low=mid+1;
        }
        else if(arr[(int)mid]==1)
        {
            if(mid==0 || arr[(int)mid]!=arr[(int)mid-1])
            
            return mid;
        else
        
            high=mid-1;
        }
        }
        return -1;
        // Your code goes here
    }
}