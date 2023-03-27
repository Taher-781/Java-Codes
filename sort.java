import java.util.*;
public class sort{
    public static void main(String[] args){
        int arr[]=new int[5];
        int temp = 0;
        Scanner input=new Scanner(System.in);

        //Input
        System.out.println("Enter Elements:-");
        for(int i=0;i<5;i++){
            arr[i]=input.nextInt();
        }


        System.out.print("Elements of Original Array:-");
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
        //Sorting;
        for(int i=0;i<5;i++){
            for(int j= i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        //Displaying
        System.out.println("Sorted Array:-");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}