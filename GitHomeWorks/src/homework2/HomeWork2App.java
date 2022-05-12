package homework2;

public class HomeWork2App {
    public static void main(String[] args) {
        System.out.println("Result task 1 > " + taskOne(5, 10));
        System.out.println("**************");
        taskTwo(5);
        System.out.println(taskThree(-5));
        System.out.println("********");
        taskFour();
    }

    public static boolean taskOne(int a, int b) {
        int sum = a + b;
        return (a + b >= 10) && (a + b <= 20);
    }



    public static void taskTwo(int a) {
        if (a >= 0) {
            System.out.println("Число " + a + " - положительное");
        } else {
            System.out.println("Число " + a + " - отрицательное");
        }

        System.out.println("********");
    }

    public static boolean taskThree(int a) {
        return a <= 0;
    }

        public static void taskFour() {

            for (int i = 0; i <= 5; i++) {
                System.out.println("Hello");
            }
        }
    }



