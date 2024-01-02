class Solution
{
    public:
    string reverseWord(string str)
    {  string st="";
        for(int i=str.size();i>=0;i--)
    {
        st+=str[i];
    }
        return st;// Your code goes here
    }
};
