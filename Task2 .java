public class Task2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        double c = Math.sqrt(a*a + b*b); // обчислення гіпотенузи
        double perimeter = a + b + c; // обчислення периметру
        double area = a * b / 2.0; // обчислення площі
        System.out.println("Периметр: " + perimeter);
        System.out.println("Площа: " + area);
    }
}
