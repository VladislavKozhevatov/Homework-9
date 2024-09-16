import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int[] salary1 = {12_500, 6_200, 7_400, 8_600, 9_300};
        int sum = 0;
        for (int i = 0; i < salary1.length; i++) {
            sum += salary1[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        // Задача 2
        System.out.println("Задача 2");
        int[] wastes = {12_500, 6_200, 7_400, 8_600, 9_300};
        int maxWaste = wastes[0];
        int minWaste = wastes[0];
        for (int i = 0; i < wastes.length; i++) {
            if (wastes[i] > maxWaste) {
                maxWaste = wastes[i];
            }
            if (minWaste > wastes[i]) {
                minWaste = wastes[i];
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + maxWaste + " рублей».");
        System.out.println("Минимальная сумма трат за неделю составила " + minWaste + " рублей».");

        //Задача 3
        System.out.println("Задача 3");
        double[] wastes2 = {12523, 6200.22, 7400.33, 8600, 9311};
        double sum1 = 0;
        double wastesPerMonth = 0;
        for (int y = 0; y < wastes2.length; y++) {
            sum1 += wastes2[y];
        }
        wastesPerMonth = sum1 / wastes2.length;//делим на на длину массива, а не на фиксированное число.
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей%n ", wastesPerMonth);

        //Задача 4
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
}