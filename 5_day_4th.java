import java.util.*;
class 5_day_4th{
   public static void main(String[] args){
      Scanner a=new Scanner(System.in);
      String str=a.nextLine();
      String arr[]=str.split(" ");
      System.out.println(arr[arr.length-1]);
      System.out.println(arr[arr.length-1].length());
   }
}
