public class minmax {
    public static void main(String[] args) {

        int[] numarray = Arrayutility.arrayuse();
        System.out.println("MIX MAX FINDER \n");
        int min = min(numarray);
        int max = max(numarray);
        System.out.print("Min number" + min);
        System.out.print("Max number" + max);
    }
    public static int min(int[] numarray){
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < numarray.length){
            if (min > numarray[i]){
                min = numarray[i];
            }
            i++;
        }
        return min;
    }

    public static int max(int[] numarray){
        if (numarray.length == 0) {
            int max = Integer.MIN_VALUE;
        }
        int max = numarray[0];
        int i = 1;
        while (i < numarray.length){
            if(max < numarray[i]){
                max = numarray[i];
            }
            i++;
        }
        return max;
    }
}
