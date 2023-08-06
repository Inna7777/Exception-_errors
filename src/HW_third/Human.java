package HW_third;

public class Human {
    String surname;
    String name;
    String patronymic;
    String birthday;
    String numberTel;
    String sex;



    public Human(String surname, String name, String patronymic, String birthday, String numberTel, String sex){
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.numberTel = numberTel;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return String.format("<%S><%S><%S><%S><%S><%S>",surname, name, patronymic, birthday, numberTel, sex);
    }

}
