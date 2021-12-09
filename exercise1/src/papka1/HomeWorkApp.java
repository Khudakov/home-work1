package papka1;

public class HomeWorkApp {


    public static void main(String[] args) {

        System.out.println("***2");
        printThreeWords();


        System.out.println("***3");
        if (checkSumSign(15, 85)) {
            System.out.println("Sum positive");
        } else {
            System.out.println("Sum negative");


            System.out.println("***4");
            System.out.println(printColor(99));
        }


        System.out.println("***5");
        System.out.println(compareNumbers(6, 34));
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static boolean checkSumSign(int a, int b) {
        return (a + b) >= 0;
    }


    public static String printColor(int value) {
        if (value <= 0) {
            return "Red";
        } else if (value > 0 & value <= 100) {
            return "Yellow";
        } else {
            return "Green";
        }

    }

    public static String compareNumbers(int a, int b) {
        if (a >= b) {
            return "a >= b";
        } else {
            return "a < b";
        }
    }
}