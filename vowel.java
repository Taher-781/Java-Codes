import java.util.*;
public class vowel{
    public static void main(String[] args){
        
        Scanner input= new Scanner(System.in);
        char a=input.next().charAt(0);
        if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' )
            System.out.println("Vowel");
        else 
            System.out.println("Consonent");
        
        

    } 
}