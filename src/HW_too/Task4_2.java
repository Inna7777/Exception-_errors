package HW_too;

import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scanner.nextLine();
        while (str.isEmpty()) {
            System.out.println("Пустую строку вводить нельзя. Введите еще раз.");
            str = scanner.nextLine();

        }
        System.out.println(str);
    }
}
