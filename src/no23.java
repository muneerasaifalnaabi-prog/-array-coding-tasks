public class no23 {
    public static void main(String[] args) {
        int[] arr1 ={4,5};
        int[] arr2 ={4,2};
        System.out.println(no23(arr1));
        System.out.println(no23(arr2));

    }
    public static boolean  no23(int[]nums){
        if (nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3) {
            return false;
        }
        return true;
    }
}
