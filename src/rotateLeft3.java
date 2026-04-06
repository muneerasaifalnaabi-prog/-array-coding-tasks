public class rotateLeft3 {
    public static void main(String[] args) {
        int[] arr ={1,2,3};
        int[] result =rotateLeft3(arr);
        for(Integer n:result){
            System.out.println(n);
        }

    }
    public static int[] rotateLeft3(int[] nums) {
        return new int[]{nums[1], nums[2], nums[0]};
    }
}

