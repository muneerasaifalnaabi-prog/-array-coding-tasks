public class biggerTwo {
    public static void main(String[] args) {
        int[] arr1 ={1,2};
        int[] arr2 ={3,4};
        int[] result = biggerTwo(arr1,arr2);
        for(Integer n:result){
            System.out.print(n+" ");
        }


    }
    public static  int[] biggerTwo(int[] a, int[] b) {
        int aTotal = a[0] + a[1];
        int bTotal = b[0] + b[1];
        if (aTotal == bTotal) {

            return a;
        }
      else if (aTotal > bTotal) {
            return a;
        }
  else
      return b;

    }

}
