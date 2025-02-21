import java.util.Scanner;
class Add
{ 
    private int a,b,c;
    public void Sum()
    {
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        c=a+b;
        System.out.println("Sum="+c);
    }
}
class Main
{
    public static void main(String s[])
    {
        Add obj=new Add();
        obj.Sum();
    }
}