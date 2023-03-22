import java.util.*;
public class cramer{
    public static void main(String[] args){
        float a,b,c,d,e,f,x,y;
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter variables a to f:-");
        a=input.nextFloat();
        b=input.nextFloat();
        c=input.nextFloat();
        d=input.nextFloat();
        e=input.nextFloat();
        f=input.nextFloat();

        System.out.println("Eq1 :- ax+by=ex");
        
        x=((e*d)-(b*f))/((a*d)-(b*c));

        System.out.println("Eq2 :- cx+dy=fy");

        y=((a*f)-(e*c))/((a*d)-(b*c));

        System.out.printf("x="+x + "y="+y);
        


    }
}