public class front11 {
    public static void main(String[] args) {
        int[] arr1 ={1,2,3};
        int[] arr2={7,9,8};
        int[] result =front11(arr1,arr2);
        for(Integer n:result){
            System.out.print(n+" ");
        }

    }

    public static int[] front11(int[] a, int[] b) {

        if (a.length == 0 && b.length == 0) {
            return new int[]{};

        }

       else if (a.length !=0 && b.length == 0) {
            return new int[]{a[0]};
        }

     else if (a.length == 0 && b.length != 0) {
            return new int[]{b[0]};
        }
     else
        return new int[] {a[0],b[0]};

    }

}
