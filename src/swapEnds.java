public class swapEnds {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] result = swapEnds(arr);
        for(Integer n:result){
            System.out.print(n+" ");
        }

    }
    public static  int[] swapEnds(int[] nums) {
        int a = nums[0];
        int b = nums[nums.length - 1];
        nums[0] = b;
        nums[nums.length - 1] =a;
        return nums;
    }

}
