package two_Dimension_Array;

import java.util.Arrays;

class solution3{
    public void transpose(int arr[][], int m, int n)
    {
        //transposing 90 degree=
        for(int i =0; i<m; i++)
        {
            for(int j =i; j<n; j++)
            {
            int temp= arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;
            }
        }

       
    }
    public void swapCol(int arr[][], int m, int n)
    {
         //swapping columns=
         for(int i=0; i<m; i++)
         {
             int li=0;
             int ri=n-1;
             while(li<ri)
             {
                 int temp=arr[i][li];
                 arr[i][li]=arr[i][ri];
                 arr[i][ri]=temp;
                 li++;
                 ri--;
             }
         }
    }
   
}
public class MatrixRotation {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int m=arr.length;
        int n=arr[0].length;
        solution3 s= new solution3();
        s.transpose(arr, m, n);
        s.swapCol(arr, m, n);

        for(var matrix:arr)
        {
            System.out.println(Arrays.toString(matrix));
        }
    }
}
