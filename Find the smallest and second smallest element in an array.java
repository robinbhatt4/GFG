class Compute 
{
    public long[] minAnd2ndMin(long a[], long n)  
    {long[] arr=new long[2];
    boolean rs=false;
        if(n==1){
            arr[0] = -1;
            arr[1] = -1;
            return arr;
        }
        Arrays.sort(a);
        arr[0]=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]!=arr[0])
            {
                rs=true;
                arr[1]=a[i];
                break;
            }
        }
        if(rs==false){
            arr[0] = -1;
            arr[1] = -1;
            return arr;
        }
        
        return arr;
    
    }
}