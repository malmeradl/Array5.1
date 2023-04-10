import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Array {

    static List<Double> fillArrayRandomly() {
        System.out.println("Input array size: ");
        int size = Integer.parseInt(Main.in.nextLine());
        List<Double> arr = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr.add(Math.pow(10, Math.random() * 6) * random.nextDouble());
        }
        return arr;
    }

    static List<Double> fillArrayByKeyboard() {
        System.out.println("Input array size: ");
        int size = Integer.parseInt(Main.in.nextLine());
        List<Double> arr = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            System.out.print("[" + i + "]= ");
            arr.add(Double.parseDouble(Main.in.nextLine()));
        }
        return arr;
    }


    static void printArray(List<Double> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println("[" + i + "]= " + arr.get(i));
        }
    }

    static double getSumCos(List<Double> arr) {
        double sum = 0;
        for (double element : arr) {
            System.out.println("cos(" + element + ") = " + Math.cos(element));
            if (Math.cos(element) > 0) {
                sum += element;
            }
        }
        return sum;
    }

    public static List<Double> removeArithmeticProgression(List<Double> list) {
        List<Double> result = new ArrayList<>();
        for (Double d : list) {
            if (!isArithmeticProgression(d)) {
                result.add(d);
            }
        }
        return result;
    }

    public static boolean isArithmeticProgression(double d) {
        int[] digits = toDigitsArray((int) Math.abs(d));
        if (digits.length < 3) {
            return false;
        }
        if (!isProgressionIncreasing(digits)) {
            return false;
        }
        for (int i = 1; i < digits.length - 1; i++) {
            if (digits[i + 1] - digits[i] != digits[1] - digits[0]) {
                return false;
            }
        }
        return true;
    }

    private static int getSize(int num) {
        int size = 0;
        while (num != 0) {
            num = num / 10;
            size++;
        }
        return size;
    }

    private static boolean isProgressionIncreasing(int[] digits) {//12345
        for (int i = 1; i < digits.length; i++) {
            if (digits[i - 1] < digits[i]) {
                return false;
            }
        }
        return true;
    }

    private static int[] toDigitsArray(int num) {
        int divider = 10;
        int[] digits = new int[getSize(num)];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = num % divider;
            num = num / divider;
        }
        return digits;
    }
}
