import java.util.*;
public class max3{
    public static void main(String[] args){
        int a,b,c;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter 3 No:-");
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        if(a>b && a>c){
            System.out.println("largest"+a);
        }
        else if(b>a && b>c){
            System.out.println("largest"+b);
        }
        else{
            System.out.println("largest"+c);
        }
    }
}