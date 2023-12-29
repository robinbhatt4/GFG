class Solution{
public:	
	
	
	int isPalindrome(string S)
	{int j=S.length()-1;
	for(int i=0;i<S.length();i++)
	{ if(S[i]!=S[j])
	    return 0;
	    
	    j--;
	    
	}
	 
	 
	 return 1;
	}

};