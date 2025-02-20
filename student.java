import java.util.Scanner;
class Student
{
    void get(String name, int num) 
    {
        System.out.println("Name: " + name + ", Regno: " + num);
    }
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String Name = in.nextLine();
        System.out.println("Enter your Regno:");
        int Regno = in.nextInt();
        Student student = new Student();
        student.get(Name, Regno);
        in.close();
    }
}
