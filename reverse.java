import java.util.*;
public class reverse{
    public static void main(String[] args){
        int arr[]=new int[10];
        System.out.println("Enter 10 numbers:-");
        Scanner input=new Scanner(System.in);
        for(int i=0;i<10;i++){
            arr[i]=input.nextInt();
        }
        for(int i=9;i>=0;i--){
            System.out.print("Reversed Numbers:-"arr[i]+" ");
        }
    }
}