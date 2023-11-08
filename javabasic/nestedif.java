import java.util.*;
public class nestedif 
{
    public static void main (String args[])
    {
        Scanner sc =new Scanner (System.in);
        System.out.println("\n enter age for entry in bodybulding tournament in years");
        int age =sc.nextInt();
       
        if(age>18)
        {
                System.out.println("Age is VERIFIED");
                {
                     System.out.println("enter weight  to check eligiblity in kg");
                     int weight =sc.nextInt();
                    if(weight>40)
                    {
                        System.out.println("congrats you are eligible");
                    }
                    else{
                        System.out.println("not enough weight ");
                    }
                }
        }
        else
        {
            System.out.println("Try next year");
        }
    }
}
