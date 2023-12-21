class Solution{
    public:
    // You need to complete this function
    int count=0;
    // avoid space at the starting of the string in "move disk....."
    long long toh(int N, int from, int to, int aux) {
        
        // if(N==0)
        // return 1;
        
        
           if(N>0) 
            {toh(N-1,from,aux,to);
            cout<<"move disk "<<N<<" from rod "<<from<<" to rod "<<to<<endl;
            
            toh(N-1,aux,to,from);
                count++;
            }
            
        return count;
        // Your code here
    }

};