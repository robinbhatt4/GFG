class Solution{
public:
    int sumOfDigits(int N){
        int rev=0;
        int sum=0;
        while(N>0)
        {
            rev=N%10;
            sum+=rev;
            N/=10;
        }
        return sum;
        //code here
    }
};