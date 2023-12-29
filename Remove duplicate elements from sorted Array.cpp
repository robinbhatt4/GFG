class Solution{
public:
    int remove_duplicate(int a[],int n){
        int count = 1;
        for(int i=1; i<n; i++){
            if(a[i]!=a[i-1]){
                a[count] = a[i];
                count++;
            }
        }
        return count;
       // code here
    }
};