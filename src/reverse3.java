import java.lang.reflect.Array;
import java.util.Arrays;

public class reverse3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        reverse3(arr);
        System.out.println(Arrays.toString(arr));


    }
    public static void reverse3(int[] nums){
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
    }

