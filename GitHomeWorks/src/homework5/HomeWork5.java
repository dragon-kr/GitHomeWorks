package homework5;

public class HomeWork5 {
    public static void main(String[] args) {

        Person mainEmployee = new Person("Mikhail", "Mikhailovich",
                "Dronskiy", "8(812)000-00-00",
                "dragon-kr@mail.ru", "Software Tester", 50000, 1974);

        Person[] office = {
                mainEmployee,
                new Person("Ivan", "Ivanovich",
                        "Ivanov", "8(812)222-22-22",
                        "ivanov@mail.ru", "manager", 50000 ,1965),
                new Person("Petrov", "Peter",
                        "Petrivich", "8(812)333-33-33",
                        "petrov@mail.ru", "engineer", 50000, 2000),
                new Person("Olga", "Olegovna",
                        "Olich", "8(812)444-44-44",
                        "olich@mail.ru", "designer", 55000, 1988),
                new Person("Semen", "Semenovich",
                        "Semenov", "8(812)555-55-55",
                        "semenov@vail.ru", "senior developer", 80000, 1972)
        };

        getAllPersonsInOffice(office);
        System.out.println("***************");
        getOldPerson(office, 40);

    }

    private static void getOldPerson(Person[] office, int year) {
        for (int i = 0; i < office.length; i++)
            if (office[i].getAge() > year) {
                System.out.println(office[i].getFullInfo());
            }
    }


    private static void getAllPersonsInOffice(Person[] office) {
        System.out.println("All person: ");
        for (int i = 0; i < office.length; i++)
            System.out.println((i + 1) + " " + office[i].getFullInfo());
    }
}
