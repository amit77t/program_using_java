import java.util.Scanner;

public class factorial {
    void fact(int n)
    {
        int fact =1;
        for(int i=1; i<=n; i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of "+n+" is "+fact+".");
    }
    public static void main(String  args [])
    {

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the nummber = ");
        int x = obj.nextInt();
        new factorial().fact(x);

       
    }
}
