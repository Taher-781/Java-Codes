import java.util.*;
public class mtofeet{
    public static void main(String[] args){
        double m,f;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter length in meters:-");
        m=input.nextDouble();
        f=m*3.2;
        System.out.println("In feets:-"+f);
   }
}