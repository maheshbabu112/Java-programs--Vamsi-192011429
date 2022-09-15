import java.util.Scanner;

public class Steps_involved {
    public static void main(String[] args) {
try{
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the  number");
        int n=s.nextInt();
        int a=0;
        while(n>0)
        {
            if(n%2==0)
            {
                n=n/2;
                a=a+1;
            }
            else
            {
                n=n-1;
                a=a+1;
            }
        }
        System.out.println("Total no steps involved= "+a);
    }
    catch(Exception e)
    {
        System.out.println("Invalid");
    }
    }
}
