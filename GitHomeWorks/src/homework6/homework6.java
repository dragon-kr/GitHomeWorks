package homework6;

public class homework6 {

    public static void main(String[] args) {

        String tempWinEvent = " ��� ����������";
        String tempLossEvent = " ��� �� ����������";
        String eventName;
        String eventResult;

        Cat cat1 = new Cat("������", 200, 200);
        Cat cat2 = new Cat("�����", 300, 100);
        Dog dog1 = new Dog("������", 0.5f, 500);
        Dog dog2 = new Dog("������", 1.5f, 450);

        Animal[] animals = {cat1, cat2, dog1, dog2};

        float runLength = 250;
        float swimLength = 10;

        for (int i = 0; i < animals.length; i++) {
            String nameString = animals[i].getType() + " " + animals[i].getName() + " ����� ";

            eventName = "��������� �� " + animals[i].getMaxRun() + " �. �������� ��������� �� ";
            eventResult = animals[i].run(runLength) ? tempWinEvent : tempLossEvent;
            result(nameString, eventName, runLength, eventResult);

            int swimResult = animals[i].swim(swimLength);
            eventName = "�������� �� " + animals[i].getMaxSwim() + " �. ������� �������� �� ";
            eventResult = (swimResult == Animal.SWIM_OK) ? tempWinEvent : tempLossEvent;

            if (swimResult == Animal.SWIM_NONE)
                eventResult = " ��� �� ����������, �.�. �� ����� �������";
            result(nameString, eventName, swimLength, eventResult);
        }

        System.out.println("All animals = " + Animal.countAnimal + " > cat count = " + Cat.countCat + " > dog count = " + Dog.countDog);
    }

    private static void result(String nameAnimal, String event, float eventLength, String resultEvent) {
        System.out.println(nameAnimal + event + eventLength + " � �" + resultEvent);
    }
}
