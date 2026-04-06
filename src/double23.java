public class double23 {
    public static void main(String[] args) {
        int[] arr = {2,5};
        System.out.println(double23(arr));
    }
    public static boolean double23(int[] nums) {
        if (nums.length == 2) {
            return (nums[0] == 2 && nums[1] == 2) ||
                    (nums[0] == 3 && nums[1] == 3);
        }
        return false;


    }
}
