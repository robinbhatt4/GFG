class Solution
{   
    public:
    //Function to rotate matrix anticlockwise by 90 degrees.
    void rotateby90(vector<vector<int> >& matrix, int n) 
    { int temp[n][n];
        for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
           temp[i][j]=matrix[j][n-1-i];
        }
    }
    //   for(int i=0;i<n;i++)
    // {
    //     for(int j=0;j<n;j++)
    //     {
    //         swap(temp[i],temp[j]);
    //     }
    // }
      for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
           matrix[i][j]=temp[i][j];
        }
       
    }
        // code here 
    } 
};