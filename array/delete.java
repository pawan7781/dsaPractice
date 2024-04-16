public class delete {
    public static int delete1(int arr[], int key, int n) {
        for (int i = 0; i < n; i++) {
            if (key == arr[i]) {
                for (int k = i; k < n - 1; k++) {
                    arr[k]=arr[k+1];
                }

            }
         
        }
        return n-1;
        
    }

    public static void main(String[] args) {
        int arr[] = new int[20];
        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 70;
        int n = 6;

        int key = 40;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        n=delete1(arr, key, n);
        System.out.println("after");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}
