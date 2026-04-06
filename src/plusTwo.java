public class plusTwo {
    public static void main(String[] args) {
        int[] arr1 = {1, 2};
        int[] arr2 = {3, 4};
        int[] result = plusTwo(arr1,arr2);
        for(Integer n:result){
            System.out.println(n);
        }


    }
    public  static int[] plusTwo(int[] a ,int[] b){
        int[] result = new int[4];
        result[0] = a[0];
        result[1] = a[1];
        result[2] = b[0];
        result[3] = b[1];
        return result;
    }

    }
