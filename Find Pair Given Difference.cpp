bool findPair(int arr[], int size, int n){
    //code
    sort(arr,arr+size);
   int i=0;
   int j=1;
   
   while(i<size && j<size){
       int diff = arr[j]-arr[i];
       if(i!=j && diff==n){
           return true;
       }else if(diff<n){
           j++;
       }else{
           i++;
       if(i==j){
          j++;
       }
   }
   }
   return false;}