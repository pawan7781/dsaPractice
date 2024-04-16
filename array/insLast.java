public class insLast {
    public static void solutionInslast(int arr[], int pos, int n, int key)
    {
        for(int i=n-1; i>=pos; i--)
        {
            arr[n+1]=arr[n];
            arr[pos]=key;
        }

    }
    
        public static void main(String[] args) {
            int[] arr = new int[20];
            arr[0] = 12;
            arr[1] = 16;
            arr[2] = 20;
            arr[3] = 40;
            arr[4] = 50;
            arr[5] = 70;
            int capacity = 20;
            int key =90;
           
            int n=6;
            // before-
            for (int i =0; i<n; i++) {
                System.out.println(arr[i]);
            }
            solutionIns.insertelem(arr, key, capacity, n);
            n++;
            //after-
            for (int i =0; i<n; i++) {
                System.out.println(arr[i]);
            }
    
        }
    
}
