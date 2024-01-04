class Solution{
public:
    long long int factorial(int N){
        //code here
        long long mul=1;
        
         if(N==1 or N==0)
        return 1;
       
       else
       return (N*factorial(N-1));
   
    }
};