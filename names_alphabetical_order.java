import java.util.*;
public class names_alphabetical_order{
   public static void main(String[] args){
      Scanner a=new Scanner (System.in);
      List<String>li=new ArrayList<>();
      System.out.println("enter the number of inputs");
      int n=a.nextInt();
      for(int i=0;i<n;i++){
         li.add(a.next());
      }
      Collections.sort(li);
      System.out.println("enter A-ascending D-descending order");
      String input=a.next();
      if(input.charAt(0)=='A'){
      for (String s : li){
         System.out.println(s);
      }
      }
      else if(input.charAt(0)=='D'){
         Collections.reverse(li);
         for(String s:li){
            System.out.println(s);
         }
      }
      else{
         System.out.println("enter either a or d ");
      }
   }
}