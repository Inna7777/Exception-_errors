package HW_third;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите Фамилию Имя Отчество дату рождения номер телефона " +
                "пол разделенные пробелом. Дата рождения - строка формата dd.mm.yyyy. " +
                "Пол - символ латиницей f или m");
        String str = scanner.nextLine();
        ArrayValidation arrayValidation = new ArrayValidation();
        arrayValidation.processString(str);
        String[] arr = str.split(" ");
        Human human = new Human(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
        scanner.close();
        WritingtoFile.writeToFile(human);

    }
 }

