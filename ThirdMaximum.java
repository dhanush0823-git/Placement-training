public class ThirdMaximum {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int a1 = Integer.MIN_VALUE, b1 = Integer.MIN_VALUE, c1 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int num = arr[i][j];

                if (num > a1) {
                    c1 = b1;
                    b1 = a1;
                    a1 = num;
                } else if (num > b1 && num < a1) {
                    c1 = b1;
                    b1 = num;
                } else if (num > c1 && num < b1) {
                    c1 = num;
                }
            }
        }

        if (c1 == Integer.MIN_VALUE) {
            System.out.println("Not enough unique numbers");
        } else {
            System.out.println("Third maximum number: " + c1);
        }
    }
}
