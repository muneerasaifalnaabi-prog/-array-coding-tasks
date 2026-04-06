public class makeLast {
    public static void main(String[] args) {
        int[] arr1 = {4, 5, 6};
        int[] result = makeLast(arr1);
        for(Integer n:result){
            System.out.println(n);
        }

    }
    public static int[] makeLast(int[] nums){
        int[] result =new int[nums.length*2];
        for(int i=0 ;i<result.length;i++){
            result[i]=0;
            result[result.length-1]=nums[nums.length-1];
        }
        return result;
    }
}
