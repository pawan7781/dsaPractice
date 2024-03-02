package two_Dimension_Array;
import java.util.Scanner;
public class Input_twoD 
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i=0;
        int j=0;
        int positive=0;
        int negative=0;
        int odd=0;
        int even=0;
        System.out.println("enter dimension of array ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        for ( i=0; i<m; i++) {
            for( j=0; j<n; j++)
            {
                arr[i][j]=sc.nextInt();
            }
            
        }
        for(i=0; i<m; i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for( i=0; i<m; i++) {
            for( j=0; j<n; j++)
            {
                if(arr[i][j]>=0)
                {
                    positive=positive+1;
                }
                if(arr[i][j]<0)
                {
                    negative=negative+1;
                }
                if(arr[i][j]%2!=0)
                {
                    odd=odd+1;
                }
                if(arr[i][j]%2==0)
                {
                    even=even+1;
                }
            }
        }
        System.out.println("number of positive values : "+positive);
        System.out.println("number of negative values : "+negative);
        System.out.println("number of odd values : "+odd);
        System.out.println("number of even values : "+even);
      
       
    }
}
