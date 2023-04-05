import java.util.Arrays;
import java.util.Scanner;

public class Main {

    //Zadatak 1a.

    public static int addNumbers(int numberA, int numberB) {
        return numberA + numberB;

    }

    public static int subtractNumbers(int numberA, int numberB) {
        return numberA - numberB;
    }

    public static int multiplyNumbers(int numberA, int numberB) {
        return numberA * numberB;
    }

    public static int divideNumbers(int numberA, int numberB) {
        return numberA / numberB;
    }

    public static void main(String[] args) {

        System.out.println("Task 1a: ");

        int numberA = 10;
        int numberB = 5;

        System.out.println("numberA + numberB = " + numberA + " + " + numberB + " = " + addNumbers(numberA, numberB));
        System.out.println("numberA + numberB = " + numberA + " - " + numberB + " = " + subtractNumbers(numberA, numberB));
        System.out.println("numberA + numberB = " + numberA + " * " + numberB + " = " + multiplyNumbers(numberA, numberB));
        System.out.println("numberA + numberB = " + numberA + " / " + numberB + " = " + divideNumbers(numberA, numberB));


        //Zadatak 1aa.

        System.out.println("\nTask 1aa: ");

        Scanner scanner = new Scanner(System.in);

        int total = 5;

        while (total != 0) {
            System.out.println("\nEnter another positive number (or negative to exit the program) : ");
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("\nExiting program...");
                break;
            }
        }

        System.out.println("Program terminated.");

        //Zadatak 1aaa.

        System.out.println("\nTask 1aaa: ");
        int startingNumber, nextNumber;

        do {
            System.out.println("\nEnter a positive starting number : ");
            startingNumber = scanner.nextInt();
        } while (startingNumber <= 0);

        while (true) {
            System.out.println("Enter the next positive number (or negative to exit the program) : ");
            nextNumber = scanner.nextInt();
            if (nextNumber < 0) {
                System.out.println("Negative number entered: " + nextNumber);
                System.out.println("Program terminated: ");
                break;
            }

        }

        //Zadatak 1b.

        System.out.println("\nTask 1b: ");

        int anyIntNumber = 1;
        int exitNumber = -1000;

        do {
            System.out.println("\nPlease enter any integer: ");
            anyIntNumber = scanner.nextInt();
            if (anyIntNumber == exitNumber) {
                System.out.println("Exit number detected: " + exitNumber);
                System.out.println("Program terminated.");
                break;
            }
        } while (nextNumber != exitNumber);


        //Zadatak 1c.

        System.out.println("\nTask 1c: ");

        Integer newTotal = null;
        System.out.println("Please enter new Integer number: ");
        int newIntNumber = scanner.nextInt();

        if (newTotal == null) {
            newTotal = 0;
        } else {

            newTotal += newIntNumber;
        }

        System.out.println("Total of " + newTotal + " and " + newIntNumber + " = " + newIntNumber);


        //Zadatak 1d. and 1e.

        System.out.println("\nTask 1d and 1e: ");

        Integer newTotal1D = null;

        System.out.println("\nPlease enter arithmetic operation (+, -, *, /): ");
        String arithmeticOperator = scanner.next();

        System.out.println("Please enter new Integer number: ");

        int newIntNumber1D = scanner.nextInt();

        if (newTotal1D == null) {
            newTotal1D = 0;
        }
        switch (arithmeticOperator) {
            case "+":
                newTotal1D += newIntNumber1D;
                break;
            case "-":
                newTotal1D -= newIntNumber1D;
                break;
            case "*":
                newTotal1D *= newIntNumber1D;
                break;
            case "/":
                if (newIntNumber1D == 0) {
                    System.out.println("Can't divide by zero: ");
                } else {
                    newTotal1D /= newIntNumber1D;
                }
                break;
        }

        System.out.println("Total of " + newTotal1D + " and " + newIntNumber1D + " using " + arithmeticOperator + " = " + newTotal1D);

        //Zadatak 2.

        System.out.println("\nTask 2:");

        int[] enteredNumbersArray = new int[100];
        int enterNumber;
        int count = 0;

        do {
            System.out.print("\nEnter any Integer number or (-10) to exit program: ");
            enterNumber = scanner.nextInt();
            if (enterNumber != -10) {
                enteredNumbersArray[count] = enterNumber;
                count++;
            }
        }while (enterNumber != -10);

        int[] finalNumbersArray = new int[count];
        for (int i = 0; i < count; i++) {
            finalNumbersArray[i] = enteredNumbersArray[i];
        }
        System.out.println(Arrays.toString(finalNumbersArray));

        //Zadatak 3.

        System.out.println("\nTask 3: ");

        int choice = 0;

        while (choice != 4) {
            System.out.println("\nCHOOSE OPTION FROM MENU: ");
            System.out.println("1. Is string a palindrome");
            System.out.println("2. Filter an Array");
            System.out.println("3. Is number divisible by two");
            System.out.println("4. Exit");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter a String: ");
                    String enteredString = scanner.next();
                    if (isPalindrome(enteredString)) {
                        System.out.println(enteredString + " is a palindrome.");
                    } else {
                        System.out.println(enteredString + " is not a palindrome.");
                    }
                    break;
                case 2:
                    System.out.print("Enter numbers for Array separated by commas: ");
                    scanner.nextLine();
                    String[] arrayString = scanner.nextLine().split(",");
                    int[] newArray = new int[arrayString.length];

                    for (int i = 0; i < arrayString.length; i++) {
                        newArray[i] = Integer.parseInt(arrayString[i]);
                    }
                    System.out.print("Enter number to be filtered out: ");
                    int number = scanner.nextInt();
                    int[] filteredArr = filterArray(newArray, number);
                    System.out.println("Filtered Array: " + Arrays.toString(filteredArr));
                    break;
                case 3:
                    System.out.print("Enter random integer number: ");
                    int numberToCheck = scanner.nextInt();
                    if (isDivisibleByTwo(numberToCheck)) {
                        System.out.println(numberToCheck + " is divisible by two.");
                    } else {
                        System.out.println(numberToCheck + " is not divisible by two.");
                    }
                    break;
                case 4:
                    System.out.println("Exit the application.");
                    break;
            }
            System.out.println();
        }
        scanner.close();
    }

    static boolean isPalindrome(String enteredString) {
        enteredString = enteredString.toLowerCase().replaceAll(" ", "");
        return enteredString.equals(new StringBuilder(enteredString).reverse().toString());
    }

    private static int[] filterArray(int[] newArray, int number) {
        int[] filteredArr = new int[newArray.length];
        int j = 0;
        for (int i = 0; i < newArray.length; i++)
            if (newArray[i] != number) {
                filteredArr[j++] = newArray[i];
            }
        return Arrays.copyOf(filteredArr, j);
    }

    private static boolean isDivisibleByTwo(int numberToCheck) {
        return numberToCheck % 2 == 0;

    }
}