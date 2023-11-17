import java.util.Arrays;

public class TwoDimentionalArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,400},{4,5,6,300},{7,8,9, 100}};
        System.out.println(Arrays.deepToString(arr));
        traversal(arr);


    }
    public static void traversal(int[][] arr)
    {
        for( int i = 0; i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }


}
