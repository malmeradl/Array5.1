import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        List<Double> arr = new ArrayList<>();

        int choice = Main.choose();
        while (choice != 0) {

            switch (choice) {
                case 0 -> {
                    System.out.println("Exit.");
                }
                case 1 -> {
                    arr = Array.fillArrayRandomly();
                }
                case 2 -> {
                    arr = Array.fillArrayByKeyboard();
                }
                case 3 -> {
                    Array.printArray(arr);
                }
                case 4 -> {
                    System.out.println("the sum is " + Array.getSumCos(arr));
                }
                case 5 -> {
                    arr = Array.removeArithmeticProgression(arr);
                }
                default -> {
                    System.out.println("No such command.");
                }
            }
            choice = choose();
        }
        in.close();
    }

    static int choose() {
        System.out.println("\nEnter the commands: ");
        System.out.println("0 - exit");
        System.out.println("1 - fill the array randomly");
        System.out.println("2 - fill array by the keyboard");
        System.out.println("3 - print array elements");
        System.out.println("4 - print the sum of the array elements where cos(element)>0");
        System.out.println("5 - remove all elements, the module of the whole part of which  is a number whose digits form an increasing arithmetic progression");

        System.out.print("\nInput: ");
        return Integer.parseInt(in.nextLine());
    }
}
