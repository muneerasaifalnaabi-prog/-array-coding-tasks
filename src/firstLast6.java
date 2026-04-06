public class firstLast6 {
    public static void main(String[] args) {
        int[] nums={1,2,6};
       // System.out.println(firstLast6(nums));

        //task 2
        int[] a1 = {1, 2, 3};
        int[] b1 = {7, 3};
        System.out.println(commonEnd(a1, b1));

    }

    public static boolean firstLast6(int[] nums) {
        if (nums.length>=1){
            if(nums[0]==6 || nums[nums.length-1] ==6) {
                return true;
            }

        }
        return false;





    }
    public static boolean  commonEnd(int[] a, int[] b){

            if(a[0]==6 && b[0]==6|| (a[a.length - 1] == b[b.length - 1])) {
                return true;
            }


        return false;

    }
}

