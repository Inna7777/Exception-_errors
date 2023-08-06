package HW_third;

public class InvalidDateException extends Exception {
    public InvalidDateException() {
        super("Неверный формат даты рождения");
    }
}
