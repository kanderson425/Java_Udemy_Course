import java.util.Scanner;

public class MinAndMaxChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int max = 0;
        int min = 0;

        while(true) {
            System.out.println("Enter Number: ");

            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt) {
                int inputNumber = scanner.nextInt();
                count ++;
                if(inputNumber > max) {
                    max = inputNumber;
                }
                if(count == 0) {
                    min = inputNumber;
                }
                if(count == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid Value");
                break;
            }

            scanner.nextLine();

        }
        System.out.println("The max number is " + max);
        System.out.println("The min number is " + min);

        scanner.close();
    }



}
