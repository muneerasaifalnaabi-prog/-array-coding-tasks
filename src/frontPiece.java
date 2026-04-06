public class frontPiece {
    public static void main(String[] args) {

        int[] arr  = {1,2,3};
        int[] result = frontPiece(arr);
        for(Integer n:result){
            System.out.print(n+" ");
        }

    }
    public static int[] frontPiece(int[] nums) {

        if (nums.length == 1){
        return new int[] {nums[0]};
        }
      else if (nums.length == 0) {

            return new int[]{};
        }
     else

        return new int[] {nums[0],nums[1]};

    }

}
