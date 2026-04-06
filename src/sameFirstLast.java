public class sameFirstLast {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(sameFirstLast(arr));

    }
    public static Boolean sameFirstLast(int[] nums ){
        if (nums.length >= 1) {

            if(nums[0]==nums.length-1){
                return true;
            }
        }
        return false;
    }
}
