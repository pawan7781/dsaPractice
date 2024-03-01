public class missingElem {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,8,9};
        int n=arr.length;
        int sum_of_natural_num=(n+1)*(n+2)/2;
        int sum=0;
        for(int i =0; i<n; i++)
        {
            sum= sum+arr[i];
        }
        int missing_value=sum_of_natural_num-sum;
        System.out.println(missing_value);
    }
}
