import java.util.*;
public class mathstable
 {
    public static void main (String args[])
    {
                Scanner sc =new Scanner (System.in);
                System.out.println("Enter number for table");
                int num =sc.nextInt();
                //loop start here
                for(int i=0;i<=10;i++)
                {
                  System.out.println(num +"X" +(i+1) +"="+(num*(i+1)));
                }
                
    }
}
