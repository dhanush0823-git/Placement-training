interface Interface1

{
    static void static1() 
    {
        System.out.println("Static in Interface1");
    }
    default void default1()
    {
        System.out.println("Default in Interface1");
    }
    void abstract1();
}
interface Interface2 extends Interface1
{
     static void static2()
    {
        System.out.println("Staticin Interface2");
    }
     default void default2()
    {
        System.out.println("Default in Interface2");
    }
     void abstract2();
}
class ImplementationClass implements Interface2
{
     public void abstract1()
    {
        System.out.println("Abstract1 implemented in ImplementationClass");
    }
     public void abstract2()
    {
        System.out.println("Abstract2 implemented in ImplementationClass");
     }
         public static void main(String[] args)
    {
        Interface1.static1();
        Interface2.static2();
        ImplementationClass obj = new ImplementationClass();
        obj.default1();
        obj.default2();
        obj.abstract1();
        obj.abstract2();
    }
}
