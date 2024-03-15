class lead{
    //Function to find the leaders in the array.
    public static void main(String[] args) {
        {
            int  nodes[]={16,17,4,3,5,2};
            leaders(nodes);
        }
    }
    
  
    public static void leaders(int a[]){
        int n=a.length;
    
        int max=a[n-1];
        for(int i=n-1;i>=0;i--)
        {
            if(a[i]>=max)
            {
                {max=a[i];
                System.out.println(a[i]);}
                
                
            }
        }
    }
};