class Main
{
    public static void main(String []args)
    {
        int x=10;
    
    
        System.out.println("inst:"+(--x + x++ + ++x + --x + x++));
        System.out.println("inst1:"+(x++ + ++x + ++x + x++ + ++x));
        System.out.println("inst:"+(--x + --x + --x + --x ));
      
        
    }
}