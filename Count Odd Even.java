
class Solution
{
    public void countOddEven(int[] arr, int n)
    {   int count=0,count2=0;
    for(int i=0;i<n;i++)
    {
        if(arr[i]%2==0)
        count++;
        else
        count2++;
    }
    System.out.println(count2+" "+count);
        // Code here
    }
}