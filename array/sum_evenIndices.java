public class sum_evenIndices {
    public static void main(String[] args) {
        int sum=0;
        int i=0;
        int arr[]={1,2,3,4,5,8,6,3,4};
        // tc=O(n)
        for(i =0; i<arr.length; i++)
        {
            if(i%2==0)
            {
                sum +=arr[i];
            }
        }
        //optimized soln- O(1)
    //    while(i<arr.length) {
    //         sum =sum+arr[i];
    //         i=i+2;
    //     }
        System.out.println(sum);
    }
}
