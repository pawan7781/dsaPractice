package two_Dimension_Array;

import java.util.Scanner;

class solution1{
    public void printarr(int arr[][], int m, int n)
    {
       
        for(int i =0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void findElem(int arr[][], int m, int n)
    {
        System.out.print("diagonal elements are : ");
        for(int i =0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print( arr[i][j]+" ");
                }
            }
            
        }
    }
}
public class print_diagElem2 {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        System.out.println("enter the array diamensions :");
        int m=sc.nextInt();
        int n= sc.nextInt();
        int arr[][]=new int[m][n];
        for(int i =0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        solution1 s= new solution1();
        s.printarr(arr, m, n);
        s.findElem(arr, m, n);
        sc.close();
    }
}
