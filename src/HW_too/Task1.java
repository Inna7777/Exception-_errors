package HW_too;

import java.util.Scanner;

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//и возвращает введенное значение. Ввод текста вместо числа не должно приводить
// к падению приложения, вместо этого, необходимо повторно запросить
// у пользователя ввод данных.
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите дробное число");
        Scanner scanner = new Scanner(System.in);
        boolean isFloat = false;
        while (!isFloat) {
            try {
                float x = Float.parseFloat(scanner.nextLine());
                isFloat = true;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не дробное число. Введите дробное число");
            }
        }
        System.out.println("Ввели правильно!");
        }

    }


