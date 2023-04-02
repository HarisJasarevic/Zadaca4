public class MathematicalFunctions {

    public static int addNumbers(int numberA, int numberB) {
        return numberA + numberB;

    }

    public static int subtractNumbers(int numberA, int numberB){
        return numberA - numberB;
    }

    public static int multiplyNumbers(int numberA, int numberB){
        return numberA * numberB;
    }

    public static int divideNumbers(int numberA, int numberB){
        return numberA / numberB;
    }

    public static void main(String[] args) {

        int numberA = 10;
        int numberB = 5;

        System.out.println("numberA + numberB = " + numberA + " + " + numberB + " = " + addNumbers(numberA, numberB));
        System.out.println("numberA + numberB = " + numberA + " - " + numberB + " = " + subtractNumbers(numberA, numberB));
        System.out.println("numberA + numberB = " + numberA + " * " + numberB + " = " + multiplyNumbers(numberA, numberB));
        System.out.println("numberA + numberB = " + numberA + " / " + numberB + " = " + divideNumbers(numberA, numberB));



    }


}
