public class unlucky1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(unlucky1(arr));

    }
    public static Boolean unlucky1(int[] nums){
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 1 && nums[i + 1] == 3) {
               return  true;

            }
        }
        return false;
    }
}
