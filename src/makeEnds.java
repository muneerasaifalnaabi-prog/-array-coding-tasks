public class makeEnds {
    public static void main(String[] args) {
        int[] arr ={1,2,3};
        int[] result =makeEnds(arr);
        System.out.println(result);
        for(Integer n :result){
            System.out.println(n);
        }
    }
    public static int[] makeEnds(int[] nums){
        return new int[]{nums[0],nums.length};
    }
}
