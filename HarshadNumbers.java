public class HarshadNumbers
{
    public static void main(String[] args)
    {
        System.out.println("Harshad Numbers between 500 and 2500:");

        for (int num = 500; num <= 2500; num++) {
            int sum = 0;
            int temp = num;

            while (temp > 0) {
                int digit = temp % 10; 
                sum =sum+ digit; 
                temp= temp/10; 
            }
            if (num % sum == 0) {
                System.out.println(num + " ");
            }
        }
    }
}
