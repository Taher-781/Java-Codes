public class pattern
{  
    public static void main(String[] args) 
    {  
        for (int i=0; i<5; i++) //outer loop for number of rows(n) 
        { 
            for (int j=4; j>=i+1; j--) //inner loop for spaces
            { 
                System.out.print(" "); //print space
            }  
            for (int j=0; j<=i; j++ ) //inner loop for number of columns
            { 
                System.out.print("* "); //print star
            } 
  
            System.out.println(); //ending line after each row
        } 
    } 
  

}



