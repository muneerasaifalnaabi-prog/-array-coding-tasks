import java.util.Arrays;

public class middleWay {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int[] result =middleWay1(arr1,arr2);
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
// Output: 2 5

    }
    public  static int[] middleWay1(int[] a ,int[] b){
        int mid1 =a.length/2;
        int mid2=b.length/2;
        return new int[]{a[mid1],b[mid2]};

    }
}
