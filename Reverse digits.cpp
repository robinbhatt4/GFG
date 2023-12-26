class Solution
{
    public long reverse_digit(long n)
    { 
     long rev=0;
        while(n!=0)
    {
        rev=(rev*10)+n%10;
    n/=10;
    
        
    }
     return rev;   // Code here
    }
}