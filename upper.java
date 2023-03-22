import java.util.*;
public class upper{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter string:- ");
        String str=input.nextLine();
        int upper=0;
        int length=str.length();
        for(int i=0;i<length;i++){
            char ch=str.charAt(i);
            if(ch>='A' && ch<='Z'){
                upper++;
            }
        }
        System.out.println("Uppercase letters:-"+upper);
    }
}