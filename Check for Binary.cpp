bool isBinary(string str)
{for(int i=0;i<str.length();i++)
{
    if(str[i]!='1'&&str[i]!='0')
    {return false;}
}
return true;
   // Your code here
}