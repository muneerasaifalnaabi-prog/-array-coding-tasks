public class fix23 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] result = fix23(arr);
       //System.out.println(result);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");

        }
    }
    public static int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3) {
                nums[i + 1] = 0;
            }
        }
        return nums;
}

    }

