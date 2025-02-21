import java.util.Scanner;
class Calculator
{
     Scanner in =new Scanner(System.in);
    public void add()
    {
    
     int a=in.nextInt();
     int b=in.nextInt();
     System.out.println("Sum="+(a+b));
    }
    public int diff()
    {
        int a1=in.nextInt();
        int b1=in.nextInt();
       return(a1-b1);
    }
    public void prod(int a, int b)
    {
        System.out.println("product="+(a*b));
    }
    public int div(int a, int b)
    {
        return(a/b);
    }
}
public class Main
        {
            public static void main(String s[])
            {
                Calculator obj=new Calculator();
                obj.add();
                System.out.println("Difference="+obj.diff());
                obj.prod(4,5);
                System.out.println("Division="+obj.div(18,8));
            }
        }