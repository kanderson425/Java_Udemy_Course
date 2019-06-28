import java.util.Scanner;

public class MinAndMaxChallenge {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int count = 0;
//        int max = 0;
//        int min = 0;
//
//        while(true) {
//            System.out.println("Enter Number: ");
//
//            boolean isAnInt = scanner.hasNextInt();
//            if(isAnInt) {
//                int inputNumber = scanner.nextInt();
//                count ++;
//                if(inputNumber > max) {
//                    max = inputNumber;
//                }
//                if(inputNumber < min) {
//                    min = inputNumber;
//                }
//                if(count == 10) {
//                    break;
//                }
//            } else {
//                System.out.println("Invalid Value");
//                break;
//            }
//
//            scanner.nextLine();
//
//        }
//        scanner.close();
//        System.out.println("The max number is " + max);
//        System.out.println("The min number is " + min);

        //Solution #1
//        Scanner scanner = new Scanner(System.in);
//
//        int min = 0;
//        int max = 0;
//        boolean first = true;
//
//        while(true) {
//            System.out.println("Enter number: ");
//
//            boolean isAnInt = scanner.hasNextInt();
//            if(isAnInt) {
//                int number = scanner.nextInt();
//
//                if(first) {
//                    first = false;
//                    min = number;
//                    max = number;
//                }
//                if(number > max) {
//                    max = number;
//                }
//                if(number < min) {
//                    min = number;
//                }
//
//            } else {
//                System.out.println("Invalid Value");
//                break;
//
//            }
//            scanner.nextLine(); // handle input
//        }
//
//        System.out.println("Min = " + min + ", Max = " + max);
//
//        scanner.close();

        //Solution # 2

        Scanner scanner = new Scanner(System.in);

//        int min = 2147483647;
        int min = Integer.MAX_VALUE;
//        int max = -2147483647;
        int max = Integer.MIN_VALUE;

        while(true) {
            System.out.println("Enter number: ");

            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt) {
                int number = scanner.nextInt();

                if(number > max) {
                    max = number;
                }
                if(number < min) {
                    min = number;
                }

            } else {
                System.out.println("Invalid Value");
                break;

            }
            scanner.nextLine(); // handle input
        }

        System.out.println("Min = " + min + ", Max = " + max);

        scanner.close();
    }



}
