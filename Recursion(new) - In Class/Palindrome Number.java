static boolean isPalindrome(int N)
    {
       String str =String.valueOf(N);

       int len = str.length();
    for(int i = 0; i < len / 2; i++)
    {
         
        if (str.charAt(i) !=
            str.charAt(len - i - 1))
            return false;
    }
    return true;
    }
