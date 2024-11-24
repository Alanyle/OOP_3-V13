import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Создаем сканер для ввода с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя количество измерений
        System.out.print("Введите количество измерений: ");
        int n = scanner.nextInt();

        // Создаем массивы для токов и напряжений
        double[] I = new double[n];
        double[] V = new double[n];

        // Вводим значения токов
        System.out.println("Введите значения токов (в амперах):");
        for (int i = 0; i < n; i++) {
            System.out.print("Ток " + (i + 1) + ": ");
            I[i] = scanner.nextDouble();
        }

        // Вводим значения напряжений
        System.out.println("Введите значения напряжений (в вольтах):");
        for (int i = 0; i < n; i++) {
            System.out.print("Напряжение " + (i + 1) + ": ");
            V[i] = scanner.nextDouble();
        }

        // Находим приближённое значение сопротивления R методом наименьших квадратов
        double numerator = 0.0; // Сумма произведений I[i] * V[i]
        double denominator = 0.0; // Сумма квадратов I[i]

        for (int i = 0; i < n; i++) {
            numerator += I[i] * V[i];
            denominator += I[i] * I[i];
        }

        // Рассчитываем R
        double R = numerator / denominator;

        // Выводим результат
        System.out.println("Приближённое значение сопротивления R: " + R);

        // Закрываем сканер
        scanner.close();
    }
}