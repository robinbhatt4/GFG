int t =m+n; // total 
int k=0;

long [] sum = new long[t];  //for merged array

for(int i=0;i<n;i++)
{
sum[k] = arr1[i];    
k++;
}
for(int j=0;j<m;j++)
{
    sum[k] =arr2[j];
    k++;
}

Arrays.sort(sum);       //sort
int f=0;
for(int i=0;i<n;i++)
{
    arr1[i] = sum[f];
    f++;
}
for(int j=0;j<m;j++)
{
    arr2[j] = sum[f];
    f++;
}