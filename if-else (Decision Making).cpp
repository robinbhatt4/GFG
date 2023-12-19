class Solution {
  public:
    string compareNM(int n, int m){
        if(m==n)
        return "equal";
        else if(m>n)
        return "lesser";
        else if(n>m)
        return "greater";
    }
};