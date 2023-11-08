import java.util.*;
class leapyear
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int a=sc.nextInt();
        if (a%400==0)
        {
            System.out.println("year is leap year");
        }
            else
            {
            System.out.println("yera is not leap year");
            }
    }
}