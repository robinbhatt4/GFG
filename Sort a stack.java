//{ Driver Code Starts
    import java.util.Scanner;
    import java.util.Stack;
    class SortedStack{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0){
                Stack<Integer> s=new Stack<>();
                int n=sc.nextInt();
                while(n-->0)
                s.push(sc.nextInt());
                GfG g=new GfG();
                Stack<Integer> a=g.sort(s);
                while(!a.empty()){
                    System.out.print(a.peek()+" ");
                    a.pop();
                }
                System.out.println();
            }
        }
    }
    // } Driver Code Ends
    
    
    /*Complete the function below*/
    class GfG{
        public Stack<Integer> sort(Stack<Integer> s)
        {   int[] arr=new int[s.size()];
        int i=0,temp=0;;
            while(!s.isEmpty())
            {
                arr[i]=s.pop();
                
                i++;
            }
            for(int k=0;k<arr.length;k++)
            {
                for(int l=k+1;l<arr.length;l++)
                {
                    if(arr[k]>arr[l])
                    {
                        temp=arr[k];
                        arr[k]=arr[l];
                        arr[l]=temp;
                    }
                }
            }
           for(int el : arr)s.push(el);
            return s;
            //add code here.
        }
    }