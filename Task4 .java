import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber1 = random.nextInt(3) + 1; // генерація першого числа
        int secretNumber2 = random.nextInt(3) + 1; // генерація другого числа
        int secretNumber3 = random.nextInt(3) + 1; // генерація третього числа

        Scanner scanner = new Scanner(System.in);
        int attempt = 1;
        while (attempt <= 2) { // користувач має 2 спроби
            System.out.println("Спроба " + attempt + ". Введіть послідовність цілих чисел від 1 до 3 через пробіл:");
            int guessNumber1 = scanner.nextInt(); // введення першого числа
            int guessNumber2 = scanner.nextInt(); // введення другого числа
            int guessNumber3 = scanner.nextInt(); // введення третього числа
            attempt++;

            if (guessNumber1 == secretNumber1 && guessNumber2 == secretNumber2 && guessNumber3 == secretNumber3) {
                System.out.println("Ура ти виграв! Вітаю щастя здоров'я.");
                }else {
                System.out.println("Сумно ти програв(");
            }

            }
        }
    }
