class solutionArr
{
    public static int search(int arr[],int key)
    {
        for (int i=0; i<arr.length;i++) {
            if(arr[i]==key)
            {
                return 1;
            }
        }
        return -1;

    }
}

public class Searching
{
    public static void main(String[] args) {
        int arr[]={1,3,5,7,9,11,13,15};
        int key=10;
       
        int s= solutionArr.search(arr, key);
        if(s==1)
        {
            System.out.println("element found");
        }
        else
        {
            System.out.println("not found");
        }

        
    }
}