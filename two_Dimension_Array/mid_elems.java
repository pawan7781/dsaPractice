package two_Dimension_Array;

import java.util.Scanner;
class solution2{
    public void printelem(int arr[][], int m, int n)
    {
       
        System.out.println("The elements  of the middle row and middle column are as follows : ");
        
         for(int i = 0 ; i < m ; i++)
         System.out.print(arr[i][m/2] + "  ");    
         for(int j = 0 ; j < m ; j++){
            if(j == m/2)continue;
            System.out.print(arr[m/2][j] + "  ");
        }
    }
   
    
}
public class mid_elems {
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
        solution2 s= new solution2();
        s.printelem(arr, m, n);
       
        sc.close();

    }
}
