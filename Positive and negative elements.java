import java.util.ArrayList;

class Solution
{
    /**
     * @param a
     * @param n
     * @return
     */
    ArrayList<Long> arranged(long a[], int n)
    { 
        
        ArrayList<Long> ans= new ArrayList<Long>();
        long arr[]=new long[n];
        int j=0,k=1;
        for(int i=0;i<n;i++)
        {
            if(a[i]>0)
           { arr[j]=a[i];
               j+=2;
           }
            
            else
            {arr[k]=a[i];
                k+=2;
            }
        }
        
        for(int i=0;i<n;i++)
        {
            ans.add(arr[i]);
            
        }
        // for(int i=0;i<n;i++)
        // {
        //    System.out.println(ans[i]+" ");
            
        // }
        System.out.println(ans);
        return ans;
    }
}
class sol{
    /**
     * @param args
     */
    public static void main (String []args)
    {
        Solution obj =new Solution();
        // ArrayList<Long> as=new  ArrayList<Long>();
        // as.add(-2);
        // as.add(1);
        // as.add(-3);
        // as.add(6);
        // as.add(-7);
        // as.add(8);
        // as.add(-9);
        // as.add(10);
        // int n=10;
        // long  a[n]={-1,2,-4,6,-1,7,-3,8,-3,8};
        long [] arr =new long[10];
        // NO! Initializers can only be used in declarations
        arr = {-1,2,-4,6,-1,7,-3,8,-3,8};
        
        //System.out.println(obj.arranged(a,10));
        obj.arranged(arr,10);

    }
}