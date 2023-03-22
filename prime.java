import java.util.*;
public class prime{
    public static void main(String[] args){
        int n,m,flag=0,i;
        n=10;
        m=n/2;
        if(n==0||n==1){
            System.out.println("Not Prime");
        }
        else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println("Not a Prime");
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println("Prime");
            }
        }
    }
}