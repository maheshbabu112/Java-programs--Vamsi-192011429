import java.util.Scanner;
public class rateofintrest{
    public static void main(String[] args)
    {
        int x,y,z;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the principal amount:");
        int a=s.nextInt();
        System.out.println("Enter the no of years:");
        int b=s.nextInt();
        System.out.println("Is customer senior citizen");
        String c=s.next();
        if((c.charAt(0))=='y')
        {
            x=a/100;
            y=x*12;
            z=y*b;
            System.out.println("The total intrest is:"+z);
        }
        else
        {
            x=a/100;
            y=x*10;
            z=y*b;
            System.out.println("The total intrest is:"+z);
        }
    }
}