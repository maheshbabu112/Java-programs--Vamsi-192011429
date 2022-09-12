import java.util.Scanner;
public class Righttriangle{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value");
        int b=s.nextInt();
        int a=b+1;
        int i,j,y=0;
        int x=a-1;
        for(i=1;i<a;i++)
        {
            for(j=1;j<a;j++)
            {
                if(j<=x)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            x=x-1;
            System.out.println();
        }
    }
}