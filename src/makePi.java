public class makePi {
    public static void main(String[] args) {
        int[] pi =makePi();
        for(Integer n:pi){
            System.out.println(n);
        }
    }
    public static int[]  makePi(){
        return new int[]{3, 1, 4};
    }
}
