class Solution {
    public boolean isPalindrome(int x) 
    {
        if(x<0)
        return false;
        int pal=x;
        int rev=0;
        while(pal!=0)
        {
            int dig=pal%10;
            rev=rev*10+dig;
            pal=pal/10;
        }
        if(x==rev)
        return true;
        else
        return false;

    }
}