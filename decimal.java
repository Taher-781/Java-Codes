import java.util.*;
public class decimal{
    public static void main(String[] args){
        System.out.print("Enter the String");
        Scanner input = new Scanner (System.in);
        String Str = input.nextLine();  
        int indexOFf = Str.indexOf(".");
        System.out.println("Integer Part: " + Str.substring(0, indexOFf));
        System.out.println("Decimal Part: " + Str.substring(indexOFf)); 

    }
}