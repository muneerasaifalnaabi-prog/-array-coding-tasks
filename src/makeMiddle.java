public class makeMiddle {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3,4};
        int[] result =makeMiddle(arr1);
        for (Integer n:result){
            System.out.print(n +" ");
        }

    }
    public  static int[] makeMiddle(int[] nums){
            int firmid = nums.length/2;
            int secmid = nums.length/2+1;
            return new int[]{firmid,secmid};


    }
}
