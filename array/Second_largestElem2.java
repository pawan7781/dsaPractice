public class Second_largestElem2 {
    public static void main(String[] args) {
        int arr[]={50,60,40,32,70,10};
        int n = arr.length;
       int current=0;
       int largest=0;
       int secondL=0;
        for( int i =0; i<n ; i++)
        {
            if(arr[i]>largest)
            {
                secondL=largest;
                largest=arr[i];
                
            }
        }
        System.out.println(secondL);
    }
}
