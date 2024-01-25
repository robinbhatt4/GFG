class Solution
{
    static int majorityElement(int a[], int size)
    {
        // int t = map.get(a[i]);
        // map.put(a[i] , t+1);
        // your code here
        if(size == 1){
            return a[0];
        }
      
        HashMap<Integer , Integer> map = new HashMap();
        for(int i=0;i<size;i++){
            if(map.containsKey(a[i])){
                map.put(a[i] , map.get(a[i])+1);
            }
            else{
                map.put(a[i] , 1);
            }
        }
        
        for(int ele : map.keySet()){
            if(map.get(ele) > size/2){
                return ele;
            }
        }
        
        return -1;
    }
}