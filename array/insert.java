class solutionIns
{
    public static int insertelem(int arr[], int key, int capacity,int n)
    {
        
        if(n>=capacity)
        {
            return n;
        }
        arr[n]=key;
        return n+1;
    }
}

public class insert {
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
        int N=solutionIns.insertelem(arr, key, capacity, n);
        //after-
        for (int i =0; i<N; i++) {
            System.out.println(arr[i]);
        }


    }
}
