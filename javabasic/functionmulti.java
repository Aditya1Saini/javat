import java.util.*;
public class functionmulti 
{
    public static int multiply(int a,int b )
    {
    return a*b;
    }


public static void main(String args[])
{
    Scanner sc=new Scanner (System.in);
    int a= sc.nextInt();
    int b= sc.nextInt();
    System.out.println("the multiplication is:"+multiply(a, b));
}
}