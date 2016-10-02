package Module6;

public final class ArrayUtils {
    static int sum(int array[]) {//sum int method
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum = sum + array[i];
        return sum;
    }

    static double sum(double array[]) { //sum double method
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i];
        return sum;
    }

    static int max(int[] array) {//max type int method
        int max = array[0];
        for (int i = 0; i < array.length; i++)
            if (max < array[i])
                max = array[i];
        return max;
    }

    static int min(int[] array) {//min type int method
        int min = array[0];
        for (int item : array)
            if (min > item)
                min = item;
        return min;
    }

    static double max(double[] array) {//max type double method
        double max = array[0];
        for (double item : array)
            if (max < item)
                max = item;
        return max;
    }

    static double min(double[] array) {//min type double method
        double min1 = array[0];
        for (double item : array)
            if (min1 > item)
                min1 = item;
        return min1;
    }

    static int maxPositive(int[] array) {  //maxPositive method
        int max = array[0];
        for (int item : array)
            if (max < item && item > 0)
                max = item;
        return max;
    }


    static double maxPositive(double[] array) {  //maxPositive type double methodfor (int i = 0; i < array.length; i++)
        double max = array[0];
        for (double item : array)
            if (max < item && item > 0)
                max = item;
        return max;
    }

    static long multiplication(int[] array) {  //multiplication intArray method
        long multiplication = 1;
        for (long item : array)
            multiplication *= item;
        return multiplication;
    }

    static long multiplication(double[] array) {  //multiplication doubleArray method
        long multiplication = 1;
        for (double item : array)
            multiplication *= item;
        return multiplication;
    }

    static int modulusArray(int balances[]) {// modulus intArray method
        int i = balances[0];
        int b = balances.length - 1;
        int mod = i % b;
        return mod;
    }

    static double modulusArray(double balances[]) {// modulus doubleArray method
        double i = balances[0];
        double b = balances.length - 1;
        double mod = i % b;
        return mod;
    }

    static int secondLargest(int[] array) {//second largest intArray method
        int secondLargest = min(array);
        for (int item : array)
            if (secondLargest < item && item < max(array))
                secondLargest = item;
        return secondLargest;
    }


    static double secondLargest(double[] array) {//second largest doubleArray method
        double secondLargest = min(array);
        for (double item : array)
            if (secondLargest < item && item < max(array))
                secondLargest = item;
        return secondLargest;
    }

    static int[] reverse(int[] array) {
        int tmp;
        for (int i=0;i<array.length/2;i++) {
            tmp = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i];
            array[i] = tmp;
        }
        return array;
    }
    static int[] findEvenElements(int[] array) {
        int[] EvenElements = new int[array.length];
        int count = 0;
        for (int Array : array) {
            if (Array % 2 == 0) {
                EvenElements[count] = Array;
                count++;
            }
        }
                return EvenElements;


        }
    }















