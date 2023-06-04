import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(41) - 20; // генерація числа в проміжку [-20; 20]
        System.out.println("Випадкове число: " + number);
    }
}
