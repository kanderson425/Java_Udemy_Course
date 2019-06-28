import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        long avg = 0;

        while(true) {
            System.out.println("Enter number: ");

            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                int number = scanner.nextInt();
                count ++;
                sum += number;
                if(count > 0) {
                    avg = Math.round((double) sum / count);
                }

            } else {
                break;
            }

            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
