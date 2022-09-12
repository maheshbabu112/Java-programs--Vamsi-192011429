import java.util.Scanner;
public class Matrix
{
  public static void main(String[] args)
   {
     int i,j;
     Scanner s=new Scanner(System.in);
     System.out.println("Enter no of rows");
     int r=s.nextInt();
     System.out.println("Enter no of coloumns");
     int c=s.nextInt();
     System.out.println("Enter elements of first matrix");
     int arr1[][]=new int[r][c];
      int arr3[][]=new int[r][c];
     for(i=0;i<r;i++)
       {
        for(j=0;j<c;j++)
          {
            arr1[i][j]=s.nextInt();
          }
       }
     System.out.println("Enter elements of Second matrix");
     int arr2[][]=new int[r][c];
     for(i=0;i<r;i++)
       {
        for(j=0;j<c;j++)
          {
            arr2[i][j]=s.nextInt();
          }
       }
     System.out.println("The Resultant sum of the Matrix is");
     for(i=0;i<r;i++)
       {
        for(j=0;j<c;j++)
          {
            arr3[i][j]=arr1[i][j]+arr2[i][j];
          }
       }
     for(i=0;i<r;i++)
       {
        for(j=0;j<c;j++)
          {
            System.out.print(" "+arr3[i][j]);
          }
         System.out.println();
       }
     }
  }
    
     
     
     