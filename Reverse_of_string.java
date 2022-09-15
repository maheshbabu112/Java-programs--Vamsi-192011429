import java.util.Scanner;

public class Reverse_of_string {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter an string");
        String s1=s.nextLine();
        int x=s1.length();
        int i;
        System.out.println("The answer is");
        for(i=x-1;i>-1;i--)
        {
            System.out.print(s1.charAt(i));
        }
    }
}
