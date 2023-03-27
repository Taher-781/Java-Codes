import java.util.*;
public class GCD   {  

    public static int gcd(int x,int y){
        int gcd=1;
        for(int i=1;i<=x && i<=y;++i){
        if(x%i==0 && y%i==0){
                gcd=i;
            }
        }
        return gcd;
    }

    public static void main(String[] args){  
    Scanner input = new Scanner(System.in);
    int x = input.nextInt();
    int y = input.nextInt();
    int ans=gcd(x,y);
    System.out.print(ans);
    }
} 