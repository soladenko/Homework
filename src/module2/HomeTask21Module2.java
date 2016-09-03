package module2.homework;
public class HomeTask21Module2 {

        public static void main(String[] args) {

            int[] intArray = {100, 200, 14, 2500, 500, 279, 5030, 1300, 6700, 20};
            double[] doubleArray = {-1.55, 20.144, 3070.345, 5.1, 358.90, 5090.5, 670.88, 67.13, 755.69, 6012.77};
            System.out.println();
            System.out.println("Sum intArray" + sum(intArray));
            System.out.println("Sum doubleArray" + sum(doubleArray));
            System.out.println("Max intArray" + max(intArray));
            System.out.println("Min intArray" + min(intArray));
            System.out.println("Max doubleArray" + max(doubleArray));
            System.out.println("Min doubleArray" + min(doubleArray));
            System.out.println("MaxPossitive" + max(intArray));
            System.out.println("MaxPossitive" + max(doubleArray));
            System.out.println("Multiplication" + multiplication(intArray));
            System.out.println("Multiplication" + multiplication(doubleArray));
            System.out.println("Modulus" + modulusArray(intArray));
            System.out.println("Modulus" + modulusArray(doubleArray));
            System.out.println("Second largest" + secondLargest(intArray));
            System.out.println("Second largest" + secondLargest(doubleArray));
        }

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
            for (double item : array) if (secondLargest < item && item < max(array))
                secondLargest=item;
            return secondLargest;
        }
    }


