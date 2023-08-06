package HW_third;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ArrayValidation {
    public void processString(String str) {
        String[] arr = str.split(" ");
        try {
            if (arr.length == 0 || arr.length < 6) {
                throw new IllegalArgumentException("Вы ввели не все данные");
            }
            String surname = arr[0];
            String name = arr[1];
            String patronymic = arr[2];
            try {
                LocalDate birthDate = LocalDate.parse(arr[3], DateTimeFormatter.ofPattern("dd.MM.yyyy"));
            } catch (DateTimeParseException e) {
                throw new InvalidDateException();
            }
            try {
                long phoneNumber = Long.parseLong(arr[4]);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Телефон содержит ошибки ввода.");
            }
                char sex = arr[5].charAt(0);
                if (sex != 'f' && sex != 'm') {
                    throw new IllegalArgumentException("Некорректный пол");
                }
                } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите Фамилию Имя Отчество дату рождения номер телефона " +
                        "пол разделенные пробелом. Дата рождения - строка формата dd.mm.yyyy. " +
                        "Пол - символ латиницей f или m.");
                String newStr = scanner.nextLine();
                processString(newStr);

            }

        }
    }


