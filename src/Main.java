import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] intNumbers = new int[3];
        intNumbers[0] = 1;
        intNumbers[1] = 2;
        intNumbers[2] = 3;
        System.out.println(Arrays.toString(intNumbers).replace("[", "").replace("]", ""));

        double[] doublesNumbers = new double[3];
        doublesNumbers[0] = 1.57;
        doublesNumbers[1] = 7.654;
        doublesNumbers[2] = 9.986;
        System.out.println(Arrays.toString(doublesNumbers).replace("[", "").replace("]", ""));

        long[] longsNumbers = new long[3];
        longsNumbers[0] = 250L;
        longsNumbers[1] = 500L;
        longsNumbers[2] = 1000L;
        System.out.println(Arrays.toString(longsNumbers).replace("[", "").replace("]", ""));

        System.out.println("Задание 2");
        int[] numbersIntegers = {1, 2, 3};
        System.out.println(Arrays.toString(numbersIntegers).replace("[", "").replace("]", ""));

        double[] numbersFractional = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(numbersFractional).replace("[", "").replace("]", ""));

        long[] numbersArbitrary = {250L, 500L, 1000L};
        System.out.println(Arrays.toString(numbersArbitrary).replace("[", "").replace("]", ""));

        System.out.println("Задание 3");
        int[] numbersIntReverse = {3, 2, 1};
        System.out.println(Arrays.toString(numbersIntReverse).replace("[", "").replace("]", ""));

        double[] numbersDoubleReverse = {9.986, 7.654, 1.57};
        System.out.println(Arrays.toString(numbersDoubleReverse).replace("[", "").replace("]", ""));

        long[] numbersLongReverse = {1000L, 500L, 250L};
        System.out.println(Arrays.toString(numbersLongReverse).replace("[", "").replace("]", ""));

        System.out.println("Задание 4");
        int[] numbers = {1, 2, 3};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] += 1;
            }
        }
        System.out.println(Arrays.toString(numbers).replace("[", "").replace("]", ""));
    }
}