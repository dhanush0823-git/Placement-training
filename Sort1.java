import java.util.Arrays;
public class Sort1 
{
    public static void main(String[] args)
    {
        int[][] sort = 
        {
            {5, 4, 7},
            {1, 8, 3},
            {9, 6, 2}
        };

        int n = sort.length;
        int m = sort[0].length;
        int size = n * m;
        int[] temp = new int[size];

        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                temp[k++] = sort[i][j];
            }
        }

        Arrays.sort(temp);

        k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sort[i][j] = temp[k++];
            }
        }
        System.out.println("Sorted Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(sort[i][j] + " ");
            }
            System.out.println();
        }
    }
}                                                                                                
