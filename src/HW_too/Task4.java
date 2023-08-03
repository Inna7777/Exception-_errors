package HW_too;

import java.util.Scanner;

//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scanner.nextLine();
        while (str.isEmpty())
            try {
                if (str.isEmpty()) {
                    throw new Exception("Пустые строки вводить нельзя");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                str = scanner.nextLine();
            }
        System.out.println(str);
    }
}






