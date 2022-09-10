import java.util.Scanner;
public class Fibonacci{ 
public static void main(String args[]){ 
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
System.out.println(fib(n)); 
} 
static int fib(int n) { 
int a=0;
int b=1;
int c;
int i;
for(i=1;i<=(n-2);i++)
{
  c=a+b;
  a=b;
  b=c;
}
return b;
}
}