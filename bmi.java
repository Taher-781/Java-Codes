import java.util.*;
public class bmi{
    public static void main(String[] args){
        double pound,inch,height,weight;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter weight in pounds:-");
        pound=input.nextFloat();
        System.out.print("Enter height in inches:-");
        inch=input.nextFloat();
        height=inch*0.0254;
        weight=pound*0.4535;
        double bmix=(weight)/(height*height);
        System.out.println("Your BMI is:-"+bmix);
    }
}