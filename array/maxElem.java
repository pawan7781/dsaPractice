public class maxElem {
    public static void main(String[] args) {
        int arr[]={1,50,7,6,14,52,86};
        int max=Integer.MIN_VALUE;
        int n=arr.length;
        for (int i : arr) {
            max= Math.max(max, i);
        }
        System.out.println(max);
    }
}
