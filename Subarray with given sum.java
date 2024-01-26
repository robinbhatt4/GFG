class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        int t=0;
        int sum=0;
        ArrayList<Integer> li=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(arr[i]==s){
                li.add(i+1);
                li.add(i+1);
                return li;
            }
            sum+=arr[i];
            while(sum>s){
                sum-=arr[t];
                t++;
            }
            if(sum==s && s!=0){
                li.add(t+1);
                li.add(i+1);
                return li;
            }
        }
        if(s==0 || sum!=s){
            li.add(-1);
        }
        return li;
    }
}