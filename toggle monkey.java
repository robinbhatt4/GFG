import java.util.*;
public class toggle {
    public static void main(String[] args) {
        int []arr={0,0,0,0,0,0,0,0,0,0};
        int count=0,count2=0;
        
        int k=0;
        for(int i=1;i<arr.length;i++)
        {   for(int j=i;j<arr.length;j++)
            {if(j%i==0)
            {
                if(arr[i]==0)
                {
                    arr[i]=1;
                    
                }
                else{
                    arr[i]=0;
                }

            }}
          
            
        }
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]==1)
           {
            count++;
           }
           else
           count2++;
        }
        System.out.println("open door-> "+count+" closed door-> "+count2);
    }
    
}
