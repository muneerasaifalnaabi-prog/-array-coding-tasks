public class midThree {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3,4,5};
        int[] result =midThree(arr1);
        for (Integer n:result){
            System.out.print(n +" ");
        }


    }
    public  static int[] midThree(int[] nums){
        int firmid = nums.length/2;
        int secmid = nums.length/2+1;
        int thirdmid =nums.length/2 +2;
        return new int[]{firmid,secmid,thirdmid};


    }
}
