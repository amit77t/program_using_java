import java.util.Scanner;
public class mearurementTool {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Select from the following options:");
        System.out.println("\n1.Calculator \n2.Area \n3.Temp.Conversion \n4.Cur.conversion");
        int n=scan.nextInt();
        if(n==1)
        {
           
            System.out.println("Select which operation you want to perform:");
            System.out.println("\n1.Add \n2.Sub \n3.Mul \n4.Div");
            int x=scan.nextInt();
            System.out.println("enter the 1st no:");
            int num1=scan.nextInt();
            System.out.println("enter the 1st no:");
            int num2=scan.nextInt();


            if(x==1)
            {
                System.out.println("addition of num1 and num2 is = "+(num1+num2));
            }
            else if(x==2)
            {
                System.out.println("subtraction of num1 and num2 is = "+(num1-num2));
            }
            else if(x==3)
            {
                System.out.println("multipilcation of num1 and num2 is = "+(num1*num2));
            }
            else if(x==4)
            {
                System.out.println("division of num1 and num2 is = "+(num1/num2));

            }
            else{
                System.out.println("please select b/w 1 to 4:");
            }


        }
        else if(n==2)
        {
            System.out.println("Select which operation you want to perform:");
            System.out.println("\n1.area of rec \n2.area of square \n3.area of circle");
            int y=scan.nextInt();
            if(y==1)
            {
                System.out.println("enter the length:");
                int l=scan.nextInt();
                System.out.println("enter the breadth:");
                int b=scan.nextInt();
                int area=l*b;
                System.out.println("Area of rectangle is = "+area);

            }
            else if(y==2)
            {
                System.out.println("enter the side of square:");
                int s=scan.nextInt();
                System.out.println("the area of square is = "+(s*s));
              
            }
            else if(y==3)
            {
                System.out.println("enter the radius  of circle:");
                int r=scan.nextInt();
                System.out.println("the area of circle is = "+(3.14*r*r));

            }
            else{
                System.out.println("please select option b/w 1 to 3:");
               
            }

        }
        else if(n==3)
        {
            System.out.println("Select which operation you want to perform:");
            System.out.println("\n1.cel to fah \n2.cel to kel  \n3.fah to cel \n4.kel to cel" );
            int z=scan.nextInt();
            if(z==1)
            {
                System.out.println("enter the temp in cel:");
                double c=scan.nextInt();
                double f=(1.8*c)+32;
                System.out.println("temperature in fahrenheit = "+f);

                
            }
            else if(z==2)

            {
                System.out.println("enter the temp in cel:");
                double c=scan.nextInt();
                double k=c+273;
                System.out.println("temperature in kelvin = "+k);


            }
            else if(z==3)
            {
                System.out.println("enter the temp in fah:");
                double f=scan.nextInt();
                double c=(f-32)*5/9;
                System.out.println("temperature in celsius = "+c);
            }
            else if(z==4)
            {
                System.out.println("enter the temp in kel:");
                double k=scan.nextInt();
                double c =k-273.15;
                System.out.println("temperature in celsius = "+c);
            }
            else
            {
                System.out.println("please select b/w 1 to 4:");
            }
        }
        else if(n==4)
        {
            System.out.println("Select which operation you want to perform:");
            System.out.println("\n1.Rupees to dollar \n2.dollar to rupees ");
            int c=scan.nextInt();

            if(c==1)
            {
                System.out.println("Enter the toatl amount in rupees Rs. = ");
                int r=scan.nextInt();
                double d=0.012*r ;
                System.out.println("total amount in dollar $ = "+d+"$");


            }
            else if(c==2)
            {
                System.out.println("Enter the total amount in Dollar$:");
                int d=scan.nextInt();
                double r=83.12*d ;
                System.out.println("total amount in rupees are Rs. = "+r+"Rs.");
            }
            else
            {
                System.out.println("please select b/w 1 to 2:");
            }

        }
        else
        {
            System.out.println("please select b/w 1 to 4:");
        }
    }
}
