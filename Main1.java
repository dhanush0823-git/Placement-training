import java.util.Scanner;
class Add
{
    public int a,b,c;
    public void Sum()
    {
       System.out.println("Sum="+c);
    }
}
class Main1
{
    public static void main(String s[])
    {
        Add obj = new Add();
        Scanner in=new Scanner(System.in);
        obj.a=in.nextInt();
        obj.b=in.nextInt();
        obj.c=obj.a+obj.b;
        obj.Sum();
    }
}