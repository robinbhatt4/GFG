class Solution{
public:
    int evenlyDivides(int N){
        int n = N;
        int i=0;
        int c=0;
        int d=0;
        while(N>0){
             d=N%10;
            
            if(d!=0  && n%d == 0){
                c++;
            }
            N/=10;
        }
        return c;
    }
};