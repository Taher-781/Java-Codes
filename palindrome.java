import java.util.*;

public class palindrome{
    public static void main(Strings[] args){
        int r,sum=0;
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        
    }
}