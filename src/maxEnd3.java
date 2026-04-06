public class maxEnd3 {
    public static void main(String[] args) {
        int[] arr={1, 2, 3};
        int[] result =maxEnd3(arr);
        for(Integer n:result){
            System.out.println(n);
        }

    }
    public static  int[]  maxEnd3(int[] nums){
        int max=0;
        if(nums[0]>nums[2]){

            max = nums[0];
        } else {
            max =nums[2];

        }
        nums[0] = max;
        nums[1] = max;
        nums[2] = max;
        return nums;
    }
}
