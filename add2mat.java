import java.util.*;
public class add2mat{
    public static void main(String[] args){
        int arr[]=new int[5];
        int arr1[]=new int[5];
        int arr2[]=new int[5];
        Scanner input=new Scanner(System.in);
        System.out.print("Enter elements for 1st array:-");
        for(int i=0;i<5;i++){
            arr[i]=input.nextInt();
        }
        System.out.print("Enter elements for 2nd array:-");
        for(int i=0;i<5;i++){
            arr1[i]=input.nextInt();
        }
        System.out.println("Summation:-");
        for(int i=0;i<5;i++){
            arr2[i]=arr[i]+arr1[i];
        }
        for(int i=0;i<5;i++){
            System.out.print(arr2[i]+" ");
        }

    }
}