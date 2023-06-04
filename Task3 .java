import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(101); // генерація числа в проміжку [0; 101)
        int c = String.valueOf(number).length(); // обчислення кількості цифр
        System.out.println("Число: " + number);
        System.out.println("Кількість цифр: " + c );
    }
}
