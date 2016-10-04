package Module6;
import Module6.ArrayUtills;
import java.util.Arrays;


public class ArrayUtills {
    private static int sum(int array[]) {//sum int method
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum = sum + array[i];
        return sum;
    }

    private static double sum(double array[]) { //sum double method
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i];
        return sum;
    }

    private static int max(int[] array) {//max type int method
        int max = array[0];
        for (int i = 0; i < array.length; i++)
            if (max < array[i])
                max = array[i];
        return max;
    }

    private static int min(int[] array) {//min type int method
        int min = array[0];
        for (int item : array)
            if (min > item)
                min = item;
        return min;
    }

    private static double max(double[] array) {//max type double method
        double max = array[0];
        for (double item : array)
            if (max < item)
                max = item;
        return max;
    }

    private static double min(double[] array) {//min type double method
        double min1 = array[0];
        for (double item : array)
            if (min1 > item)
                min1 = item;
        return min1;
    }

    private static int maxPositive(int[] array) {  //maxPositive method
        int max = array[0];
        for (int item : array)
            if (max < item && item > 0)
                max = item;
        return max;
    }


    private static double maxPositive(double[] array) {  //maxPositive type double methodfor (int i = 0; i < array.length; i++)
        double max = array[0];
        for (double item : array)
            if (max < item && item > 0)
                max = item;
        return max;
    }

    private static long multiplication(int[] array) {  //multiplication intArray method
        long multiplication = 1;
        for (long item : array)
            multiplication *= item;
        return multiplication;
    }

    private static long multiplication(double[] array) {  //multiplication doubleArray method
        long multiplication = 1;
        for (double item : array)
            multiplication *= item;
        return multiplication;
    }

    private static int modulusArray(int balances[]) {// modulus intArray method
        int i = balances[0];
        int b = balances.length - 1;
        int mod = i % b;
        return mod;
    }

    private static double modulusArray(double balances[]) {// modulus doubleArray method
        double i = balances[0];
        double b = balances.length - 1;
        double mod = i % b;
        return mod;
    }

    private static int secondLargest(int[] array) {//second largest intArray method
        int secondLargest = min(array);
        for (int item : array)
            if (secondLargest < item && item < max(array))
                secondLargest = item;
        return secondLargest;
    }


    private static double secondLargest(double[] array) {//second largest doubleArray method
        double secondLargest = min(array);
        for (double item : array)
            if (secondLargest < item && item < max(array))
                secondLargest = item;
        return secondLargest;

    }


    public static void main(String[] args) {
        int[]array={20,30,40,50,60};

        //System.out.println(sum(array));
        System.out.println(ArrayUtils.sum(array));
    }

    }