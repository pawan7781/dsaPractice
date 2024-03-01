public class palindrome
{
    public static void main(String[]args)
    {
        int arr[]={1,2,3,2,1};
        boolean flag=true;
        for(int i =0; i<arr.length/2; i++)
        {
            if(arr[i]!=arr[arr.length-i-1])
            {
                flag= false;
                System.out.println("this is not palindrome");
                break;
            }
           
        }
        if(flag==true)
        {
            System.out.println("this is palindrome");
        }
        else
        {
            System.out.println("this is not a palindrome");
        }
    }
}
