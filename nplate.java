import java.util.*;
    public class nplate{
        public static void main(String[] args){
            Random r = new Random();
            int n1 = r.nextInt(10);
            int n2 = r.nextInt(10);
            int n3 = r.nextInt(10);
            int n4 = r.nextInt(10);
            char c1 = (char)(r.nextInt(26) + 'A');
            char c2 = (char)(r.nextInt(26) + 'A');
            char c3 = (char)(r.nextInt(26) + 'A');

            System.out.println("" + (char)(c1)+ (char)(c2)+ (char)(c3)+n1 + n2 + n3 + n4);       
        }
    }
    
