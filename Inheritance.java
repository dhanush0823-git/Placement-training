class College
{
    public int aicteid=720722104;
    public void display()
    {
        System.out.println(aicteid);
    }
}
class Department extends College
{
    public int Deptid = 104;
    public void show()
    {
        System.out.println(Deptid);
    }
}
class Num extends Department 
{
    public int Regno=7207;
    public void disp()
    {
        System.out.println(Regno);
    }
}

public class Inheritance
{

   public static void main(String []args)
   {
   Num c = new Num();
   c.display();
   c.show();
   c.disp();
    
    
}
}









