package homework5;

public class Person {
    private static final int CURRENT_YEAR = 2022;

    private String surname;
    private String secondName;
    private String name;
    private String position;

    private String email;
    private String phone;
    private int salary;
    private int birthYear;

    public Person(String name,
                  String secondName,
                  String surname,
                  String phone,
                  String email,
                  String position,
                  int salary,
                  int birthYear) {
        this.birthYear = birthYear;
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.email = email;
    }


    int getAge() {
        return CURRENT_YEAR - birthYear;
    }

    int getSalary() {
        return salary;
    }

    String getFullInfo() {
        return this.name + " " +
                this.secondName + " " +
                this.surname + ", " +
                this.getAge() + " years old, " +
                this.position + ". Salary is: " +
                this.phone + ". Phone number " +
                this.getSalary() + " RU";
    }
}
