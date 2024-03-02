public class Second_largestElem {
    public static void main(String[] args) {
        int arr[]={50,60,40,32,70,10};
        int n = arr.length;
       
        for(int i =0; i<n ; i++)
        {
            for(int j = i+1; j<n; j++)
            {
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;

            }
            
        }
        System.out.println("second largest elem is : "+arr[n-2]);
    }
}
