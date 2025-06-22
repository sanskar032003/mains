public class sumndavg {
    public static void main(String []args){
        System.out.println("sum and average");
        int[] numArray = Arrayutility.arrayuse();
        long sum = sum(numArray);
        int average = average(numArray);
        System.out.println("sum is :" + sum);
        System.out.println("average is :" + average);
    }
    public static long sum(int[] numArray){
        long sum = 0;
        int i = 0;
        while(i < numArray.length){
            sum += numArray[i];
            i++;
        }
    return sum;
    }
    public static int average(int[] numArray){
        long sum = sum(numArray);
        return (int) (sum/ numArray.length);
    }
}
