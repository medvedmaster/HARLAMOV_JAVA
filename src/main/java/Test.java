// (если введенное число больше 7, то вывести "Привет")://

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number > 7) {
            System.out.println("Привет");
        } else System.out.println("Ваше число меньше),попробуйте ещё!");
    }
}
