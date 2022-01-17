public class RecursionTest4 {
    public static int loopSum(int[] arrs){
        int sum=0;
        for(int item: arrs){
            sum+=item;
        }
        return sum;
    }

    public static int RecursionSum(int[] arrs){

    }

    public static void main(String[] args) {
        int[] test_example =new int[]{2,54,23,16,5,6};
        int resule = loopSum(test_example);
        System.out.println(resule);
    }
}
