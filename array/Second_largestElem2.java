public class Second_largestElem2 {
    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,9,3,7};
        int n = arr.length;
     
       int largest=0;
       int secondL=0;
        for( int i =0; i<n ; i++)
        {
            if(arr[i]>largest)
            {
                secondL=largest;
                largest=arr[i];
                
            }
            else if(arr[i]>secondL)
            {
                secondL=arr[i];
            }
        }
        System.out.println(secondL);
    }
}
