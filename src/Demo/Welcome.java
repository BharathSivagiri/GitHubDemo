package Demo;

import java.util.*;
public class Welcome
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = scan.nextInt();
        if(age >= 18)
        {
            System.out.println("Eligible...");
        }
        else
        {
            System.out.println("Not eligible....");
        }
    }
}
